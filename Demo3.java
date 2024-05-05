import java.util.Scanner;

	public class Demo3{
		public static void main(String[]args){
			
   		 Scanner input = new Scanner(System.in);
			int factor = 0;
			int counter = 1;
			
		  System.out.print("Enter a number: ");
		    int number = input.nextInt();
		      
			while(counter <= number){
			 if(number % counter == 0){
			   
	}
		
			factor++;
}
		counter = counter + 1;

		System.out.printf(factor);


	}