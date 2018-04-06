import java.util.Scanner;

public class DoMaths {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		boolean stop = false;
		
		String sysOutput;
		double number1;
		double number2;
		
		while(!stop) {
			System.out.println("What maths would you like to do?");
			System.out.println("We got \"add\", \"subtract\", \"divide\" and \"multiply\"");
			System.out.println("or \"stop\" to stop the program");
			
			sysOutput = s.nextLine().toLowerCase().trim();
			
			if(sysOutput.equals("stop")) {
				stop = true;
				continue;
			}
			
			System.out.println("What numbers would you like to use for your " + sysOutput + "?");
			
			number1 = Double.parseDouble(s.nextLine()); //as the s.nextInt() method doesn't consume the new line character so it skips the above sysOutput
			number2 = Double.parseDouble(s.nextLine());
			
			System.out.println(whatMaths(sysOutput, number1, number2));
		}
		
	}
	
	public static String whatMaths(String input, double number1, double number2) {
		String output = "";
		
		switch (input) {
		
		case "add":
			output = Double.toString(number1 + number2);
			break;
			
		case "subtract":
			output = Double.toString(number1 - number2);
			break;
		
		case "divide":
			output = Double.toString(number1 / number2);
			break;
			
		case "multiply":
			output = Double.toString(number1 * number2);
			break;
			
		default:
			return "invalid calculation, please try again";
		}
		
		if((output.length() - output.indexOf(".")) >  5) {
			return output.substring(0, output.indexOf(".")+2);
		} else {
			return output;
		}
	}
}
