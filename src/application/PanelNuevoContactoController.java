package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class PanelNuevoContactoController extends AnchorPane{

	 public PanelNuevoContactoController(){
		 System.out.println("estamos en el constructor del panel");
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("panelnuevocontacto.fxml"));

	        fxmlLoader.setRoot(this);
	        fxmlLoader.setController(this);

	        try {
	            fxmlLoader.load();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}