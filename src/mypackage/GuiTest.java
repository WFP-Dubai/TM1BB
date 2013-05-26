package mypackage;

import java.util.Timer;

import net.rim.device.api.ui.UiApplication;

public class GuiTest extends UiApplication {
    static Timer t; 

    public static void main(String[] args) {

         if(args.length>0&&"alternate".equals(args[0])){

                            BackGroundApp app = new BackGroundApp();
                            app.startBackgroundThread();
                            app.enterEventDispatcher();

            }

         else{
             GuiTest test = new GuiTest();          
             test.enterEventDispatcher();
         }
    }
    public GuiTest(){
        Myscreen screeMyscreen = new Myscreen();
        pushScreen(screeMyscreen);
    }

}

