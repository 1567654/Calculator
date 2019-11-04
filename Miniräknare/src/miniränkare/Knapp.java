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
		char[] numpad = {'1','2','3','/','4','5','6','*','7','8','9','-',' ','0','.','+'};
		buttonList = new ArrayList<Button>();
		for (char key : numpad) {
			String synum = key + "";
			Button buton = new Button(synum);
			buton.setMinSize(30, 30);
			buton.setOnAction(event ->{textfield.textProperty().set(textfield.textProperty().get() +synum);});
			buttonList.add(buton);
		}
		// Loopar igenom knapparna och lägger alla knapparna från char[] numpad på rätt plats i gridpane
		int columnIndex = 0;
		while(columnIndex != 4) {
		for (int i = 0; i < 4; i++) {
			gridpane.add(buttonList.get(i + (columnIndex * 4)), i, columnIndex);
			if (i == 3) {
				columnIndex ++; 
			}
		}
		}
		
		// Sätter in = knappen och ersätter innehållet på textfielden med uträkningen när man trycker på knappen
		String toString = '=' + "";
		equals = new Button(toString);
		equals.setMinSize(30, 30);
		gridpane.add(equals, 3, 5);
		Uträkning uträkning = new Uträkning();
		equals.setOnAction(event ->{textfield.textProperty().set(uträkning.beräkning(textfield.getText()));});
		
		// Sätter in C knappen och rensar textfielden när trycker på knappen
		String toString2 = 'C' + "";
		Button clear = new Button(toString2);
		clear.setMinSize(30, 30);
		gridpane.add(clear, 2, 5);
		clear.setOnAction(event ->{textfield.clear();});
	}
	
		
		
}
