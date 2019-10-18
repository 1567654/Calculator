package miniränkare;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Knapp extends Stage {
	ArrayList<Button> buttons;
	GridPane gridpane; 
	TextField textfield;
	
	public Knapp() {
		gridpane = new GridPane();
		gridpane.setHgap(3);
		gridpane.setVgap(3);
		textfield = new TextField();
		
		// Skapar knappar med en storlek och olika namn och lägger de i en arraylist
		char[] numpad = {'1','2','3','4','5','6','7','8','9','C','0',',','/','*','-','+','='};
		buttons = new ArrayList<Button>();
		for (char key : numpad) {
			String synum = key + "";
			Button buton = new Button(synum);
			buton.setMinSize(30, 30);
			buttons.add(buton);
		}
		gridpane.add(textfield, 4, 5);
		// Loopar igenom knapparna och lägger knapparna 1 till , på rätt plats i gridpane
		int columnIndex = 0;
		while(columnIndex != 4) {
		for (int i = 0; i < 3; i++) {
			gridpane.add(buttons.get(i + (columnIndex * 3)), i, columnIndex);
			if (i == 2) {
				columnIndex ++; 
			}
		}
		}
		// Sätter in resten av knapparna lodrätt
		for (int i = 0; i < 5; i++) {
			gridpane.add(buttons.get(i + 12), 3, i);
		}
		
	}
	
	

}
