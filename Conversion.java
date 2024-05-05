import java.util.Scanner;

		public class Conversion{
		 public static void main(String[]args){
		  
			double pound = 0.454;
			double KilogramPerGram = 2.20462;


			Scanner input = new Scanner(System.in);
			 System.out.print("Enter number in pounds: ");
			 double pounds = input.nextDouble();
		
			System.out.print("Enter a number in kilogram: ");
			 double Kilogram = input.nextDouble();


			double kilogramperGram = pound * kilogram;
			double pound = kilogram * pound;


		System.out.println(pound + "pounds is " + kilograms + "kilogram");
		System.out.println(kilogram + "kilogram is " + pound + "pound");


		
		


	}
		





}