package miniränkare;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Miniräknaren extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Knapp knapp = new Knapp();
		VBox vertical = new VBox(); 
		vertical.setSpacing(20);
		ObservableList list = vertical.getChildren();
		list.addAll(knapp.textfield, knapp.gridpane);
		Scene scene = new Scene(vertical, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch();
	}

}
