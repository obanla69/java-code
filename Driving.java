import java.util.Scanner;


	public class Driving{

		public static void main(String[]args ) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance:");
		int distance = input.nextInt();

		System.out.print("Enter the miles per gallon:");
		int miles = input.nextInt();
		
		System.out.print("Enter the price per gallon:");
		int price = input.nextInt();

		int cost = distance * miles  / price;

		System.out.printf("The cost of driving is d%", cost);






}









}