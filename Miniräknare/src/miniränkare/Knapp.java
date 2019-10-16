package miniränkare;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Knapp extends Stage {
	ArrayList<Button> buttons;
	static GridPane gridpane = new GridPane();
	
	public Knapp() {
		// Skapar knappar med olika namn och lägger de i en arraylist
		char[] numpad = {1,2,3,4,5,6,7,8,9,',',0,'C','/','*','-','+','='};
		buttons = new ArrayList<Button>();
		for (char key : numpad) {
			String synum = key + "";
			Button buton = new Button(synum);
			buttons.add(buton);
		}
		// Loopar igenom knapparna och lägger knapparna 1 till C på rätt plats i gridpane
		int columnIndex = 0;
		while(columnIndex != 3) {
		for (int i = 0; i < 3; i++) {
			gridpane.add(buttons.get(i + (columnIndex * 3)), columnIndex, i);
			if (i == 2) {
				columnIndex ++; 
			}
		}
		}
		
		for (int i = 0; i < 4; i++) {
			gridpane.add(buttons.get(i + 12), i, 3);
		}
		
	}
	
	

}
