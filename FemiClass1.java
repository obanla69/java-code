

import java.util.Scanner;

	public class FemiClass1{
		public static void main(String[]args){
	
			int multiply = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		multiply = number1 * number2;
		if(multiply > 100){
		System.out.print("The multiply number is greater than 100");
		}
		else if (multiply < 100){
		System.out.print("The multiply number is less than 100");
		}
		
		
		
	}
		
		
}
	
	
	
	


