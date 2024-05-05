
import java.util.Scanner;



		public class Citizen{

			public static void main(String [] args) {

			Scanner input = new Scanner(System.in);

			double total  = 30000;
			double gradeCounter = 20;
			double rate = 0.15;

			System.out.print("earning of the year:");
			double earning = input.nextDouble();

			System.out.print("rate of the year: ");
			 rate = input.nextDouble();

			System.out.print("comission of the year: ");
			 double comission = input.nextDouble();
			
			while(earning < 30000){
			total = total * comission;
			gradeCounter = gradeCounter + 1;
			System.out.print(earning <= 30000);
			 total = input.nextDouble();
				
			}

			if(earning < 30000){
			double average = earning / comission;	
			System.out.printf("%nAverage of is " , average);
			}
			
			





	}
	




}