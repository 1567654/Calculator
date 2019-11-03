package miniränkare;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Knapp{
	ArrayList<Button> buttonList;
	GridPane gridpane; 
	TextField textfield;
	Button equals;
	
	public Knapp() {
		gridpane = new GridPane();
		gridpane.setHgap(3);
		gridpane.setVgap(3);
		textfield = new TextField();
		textfield.setEditable(false);
		
		// Skapar knappar med en storlek och olika namn och lägger de i en arraylist
		char[] numpad = {'P','1','2','3','4','5','6','7','8','9','C','0',',','/','*','-','+'};
		buttonList = new ArrayList<Button>();
		for (char key : numpad) {
			String synum = key + "";
			Button buton = new Button(synum);
			buton.setMinSize(30, 30);
			buton.setOnAction(event ->{textfield.textProperty().set(textfield.textProperty().get() +synum);});
			buttonList.add(buton);
		}
		// Loopar igenom knapparna och lägger knapparna 1 till , på rätt plats i gridpane
		int columnIndex = 0;
		while(columnIndex != 4) {
		for (int i = 1; i < 4; i++) {
			gridpane.add(buttonList.get(i + (columnIndex * 3)), i, columnIndex+1);
			if (i == 3) {
				columnIndex ++; 
			}
		}
		}
		// Sätter in resten av knapparna lodrätt
		for (int i = 1; i < 5; i++) {
			gridpane.add(buttonList.get(i + 12), 4, i);
		}
		
		// Sätter in = knappen och ersätter innehållet på textfielden med uträkningen
		String toString = '=' + "";
		equals = new Button(toString);
		equals.setMinSize(30, 30);
		gridpane.add(equals, 4, 5);
		Uträkning uträkning = new Uträkning();
		equals.setOnAction(event ->{textfield.textProperty().set(uträkning.beräkning());});
	}
	
	

}
