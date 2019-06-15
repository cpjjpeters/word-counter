package be.ipeters.javafx.alternatewordcounter;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox parent = new VBox();
		parent.getChildren().add(new Label("Inline word counter"));
		HBox urlArea = new HBox(new Label("URL:"));
		TextField textField = new TextField();
		
		urlArea.getChildren().add(textField);
		
		parent.getChildren().add(urlArea);
		Button button= new Button("Count words");
		button.setOnAction(event->System.out.println("I would access "+textField.getText()+ " here"));
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("I would access "+textField.getText()+ " there");
//				
//			}
//		});
		parent.getChildren().add(button);
		Scene scene = new Scene(new Label("Input"));
		
		
		primaryStage.setScene(new Scene(parent));
		primaryStage.show();
	}
}
