import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;

public class App extends Application {
	

	public void start(Stage s) throws Exception{
		Scene cena = new Scene(FXMLLoader.load(getClass().getResource("/app.fxml")));
		cena.getStylesheets().add("/app.css");
		s.setScene(cena);
		s.show();
		s.setTitle("Dados sobre telefonia no Brasil");
	}
	

	public void estadoClicado(MouseEvent e){
		System.out.println("Label Clicado!");
	}
	
}
