package miniränkare;


public class Uträkning{
	

	public String beräkning(String expression){
		Addition addition = new Addition();
		Subraktion subtraktion = new Subraktion();
		Multiplikation multiplikation = new Multiplikation();
		Division division = new Division();
		
		String input = expression;
		int operatorIndex = 0;
		String summa="";
		double sum = 0;

		for (char c : input.toCharArray()) {
			if (c == '+') {
				String tal1 = input.substring(0,operatorIndex);
				String tal2 = input.substring(operatorIndex+1, input.length());
				double nyTal1 = new Double(tal1);
				double nyTal2 = new Double(tal2);
				sum = addition.tal(nyTal1, nyTal2);
				summa = Double.toString(sum);
				return summa;
				}
			else if(c == '-') {
				String tal1 = input.substring(0,operatorIndex);
				String tal2 = input.substring(operatorIndex+1, input.length());
				double nyTal1 = new Double(tal1);
				double nyTal2 = new Double(tal2);
				sum = subtraktion.tal(nyTal1, nyTal2);
				summa = Double.toString(sum);
				return summa;
			}
			else if(c == '*') {
				String tal1 = input.substring(0,operatorIndex);
				String tal2 = input.substring(operatorIndex+1, input.length());
				double nyTal1 = new Double(tal1);
				double nyTal2 = new Double(tal2);
				sum = multiplikation.tal(nyTal1, nyTal2);
				summa = Double.toString(sum);
				return summa;
			}
			else if(c == '/') {
				String tal1 = input.substring(0,operatorIndex);
				String tal2 = input.substring(operatorIndex+1, input.length());
				double nyTal1 = new Double(tal1);
				double nyTal2 = new Double(tal2);
				sum = division.tal(nyTal1, nyTal2);
				summa = Double.toString(sum);
				return summa;
			}
			operatorIndex++;
			
	}
			
		return "0";
		
	}

}
