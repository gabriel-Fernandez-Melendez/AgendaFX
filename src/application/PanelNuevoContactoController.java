package application;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PanelNuevoContactoController extends AnchorPane{

	//aqui deben ir las propiedades de la ventana con las que vamos a necesitar interactuar
	@FXML
	private TextField campo_nombre;
	@FXML
	private TextField campo_telefono;
	@FXML
	private TextField campo_email;
	@FXML
	private RadioButton radiob_masculino;
	@FXML
	private RadioButton radiob_femenino;
	@FXML
	private RadioButton radiob_apachedecombate;
	@FXML
	private ChoiceBox<String> grupo_;
	@FXML
	private TextField notas_adicionales;
	@FXML
	private DatePicker fechadenacimiento;
	@FXML
	private Image imagen_;
	@FXML
	private Button aceptar;
	@FXML
	private Button borrar;
	@FXML
	private Button atras;
	
	
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
	 
	 //apartir de aqui se deben hacer los metodos de funcionalidad de la ventana
	 @FXML
	 public void grupogeneros(){
		 ToggleGroup t =new ToggleGroup();
		 radiob_masculino.setToggleGroup(t);
		 radiob_femenino.setToggleGroup(t);
		 radiob_apachedecombate.setToggleGroup(t);
	 }
	 @FXML
	 public void grupo_combobox() {
		 grupo_.setItems(FXCollections.observableArrayList("Amigos", "Familia", "trabajo"));
		 grupo_.setValue("Amigos");
		 handleListView();
	 }
	 @FXML
	 private void handleListView() {
		 grupo_.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
				System.out.println("Elemento seleccionado: " + newValue);
			});
		}
	 @FXML
	 public void RecogerFecha() {
		 LocalDate localDate = fechadenacimiento.getValue();
		 System.out.println(localDate +"por ejemplo");
	 }
}
