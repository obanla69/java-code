import java.util.Scanner;


	public class Interest{

		public static void main(String[] args){

			Scanner input = new Scanner (System.in);


		System.out.print(" Enter the balance :");
			
		int balance = input.nextInt();

		System.out.println("Enter the annual rate:");
		
		double annualInterestRate = input.nextDouble();

		double interest =  balance * (annualInterestRate / 1200);

		System.out.printf("The interest rate for the month %.5f%n", interest);
}



}