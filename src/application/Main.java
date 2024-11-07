package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//C:\Users\Gabriel\Downloads\openjfx-21.0.5_windows-x64_bin-sdk\javafx-sdk-21.0.5\lib
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanamain.fxml"));
	        Parent root = loader.load(); // Cargamos el archivo FXML
	        primaryStage.setTitle("Agenda de Contactos");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
