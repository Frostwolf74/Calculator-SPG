package defaultPackage;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float number0, number1, answer=0;
		String operator;
		
		boolean error = false;
		do {
			error = false;
			System.out.println("Enter the first number: ");
			number0 = input.nextFloat();
			
			System.out.println("Enter operator: ");
			operator = input.next();
			input.nextLine();
			
			System.out.println("Enter the second number: ");
			number1 = input.nextFloat();
			
			switch(operator) {
				case "+":
					answer = number0 + number1;
					break;
				case "-":
					answer = number0 - number1;
					break;
				case "*":
					answer = number0 * number1;
					break;
				case "/":
					if(number1 == 0) {
						System.out.println("You cannot divide by zero");
					}
					else {
						answer = number0 / number1;
					}
					break;
				default:
					System.out.println("Please try again");
					error = true;
					break;
					
			}
		}while(error);
		
		System.out.printf("The answer is: %.2f", answer);
		
		System.out.println("\n\nRun the program again? (1/0): ");
		int repeat = input.nextInt();
		
//		if(repeat == "y" || repeat == "Y") { // i wanted to use y/n but it just wouldnt work for some reason
//			main(args);
//		}
		
		if(repeat == 1) { 
			main(args); // wacky recursion with main 
		}
	}
}
