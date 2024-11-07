package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class PanelNuevoContactoController extends AnchorPane{

	//aqui deben ir las propiedades de la ventana con las que vamos a necesitar interactuar
	
	
	 public PanelNuevoContactoController(){
		 Parent parent;
		 Scene scene;
		 System.out.println("estamos en el constructor del panel");
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("panelnuevocontacto.fxml"));

	        fxmlLoader.setRoot(this);
	        fxmlLoader.setController(this);

	        try {
	           parent =fxmlLoader.load();
	           scene =new Scene(parent,100,100);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 //apartir de aqui se deben hacer los metodos de funcionalidad de la ventana
}
