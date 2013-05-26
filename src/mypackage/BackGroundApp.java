package mypackage;
import net.rim.device.api.system.Application;
import net.rim.device.api.system.Bitmap;
import net.rim.device.api.ui.Manager;
import net.rim.device.api.ui.Screen;
import net.rim.device.api.ui.Ui;
import net.rim.device.api.ui.UiEngine;
import net.rim.device.api.ui.component.Dialog;


public class BackGroundApp extends Application {
//  this class is used for the background processing .....

     public void startBackgroundThread()
        {
            new Thread(){
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(60000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (getEventLock()) {
                            //with this UiEngine pushGlobal dialogs
                            //whenever with the app in background
                            UiEngine ui = Ui.getUiEngine();
                            Screen screen = new Dialog(Dialog.D_OK, "You have updates!",
                                    Dialog.OK, Bitmap
                                            .getPredefinedBitmap(Bitmap.EXCLAMATION),
                                    Manager.VERTICAL_SCROLL);
                            ui.pushGlobalScreen(screen, 1, UiEngine.GLOBAL_QUEUE);

                        }
                    }
                }
            }.start();
        }

}