package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
		private Scene scene;
		private Parent root;
	
		public void switchToMain(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	
	@FXML	
		public void switchToLogged(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("Logged.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	}
	@FXML	
	public void switchToCadastro(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
}
	
	
	@FXML
		private Button loginButton;
	
	@FXML
		private AnchorPane scenePane;
	@FXML
		private Button cadastroButton;
	
	Stage stage;
	
	public void login(ActionEvent event) {

	stage = (Stage) scenePane.getScene().getWindow();
	System.out.println("You successfully logged in!");
	stage.close();
		
}
	

	
}