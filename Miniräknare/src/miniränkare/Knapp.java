package miniränkare;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Knapp extends Group {
	ArrayList<Button> buttons;
	GridPane gridpane = new GridPane();
	
	public Knapp() {
		char[] numpad = {1,2,3,4,5,6,7,8,9,0,'=','+','-','*','/','C'};
		buttons = new ArrayList<Button>();
		for (char key : numpad) {
			String synum = key + "";
			Button buton = new Button(synum);
			buttons.add(buton);
		}
		int columnIndex = 0;
		for (int i = 0; i < 3; i++) {
			gridpane.add(buttons.get(i), columnIndex, i);
			if (i == 2) {
				columnIndex ++;
				for (int j = 0; j < 3; j++) {
					gridpane.add(buttons.get(j), columnIndex, j);
				}
			}	
		}
			
		
		
	}
	
	

}
