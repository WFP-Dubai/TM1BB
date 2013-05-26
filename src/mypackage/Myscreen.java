package mypackage;

import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.ButtonField;

public class Myscreen extends MainScreen {



    public Myscreen(){
    CreateGui();
    }

    public void CreateGui(){
    	setTitle("MyTitle");
    	ButtonField mySubmitButton = new ButtonField("Submit");
    	add(mySubmitButton);
    	
     }

}