package miniränkare;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Miniräknaren extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		Knapp knapp = new Knapp();
		root.getChildren().add(knapp);
	}
	public static void main(String[] args) {
		launch();
	}

}
