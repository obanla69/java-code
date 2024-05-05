import java.util.Scanner;

		   public class Drill2{
		 public static void main(String[]args){
	          Scanner input = new Scanner(System.in);
		
			int gradeCounter = 1;
			int sum = 0;
			int total = 0;
		
		while(gradeCounter <= 10 ){
		System.out.print("Enter a score: ");
		int score = input.nextInt();
	
		sum = sum + score;
		gradeCounter = gradeCounter + 1;

	}
		
		double average = sum / 10;			


		System.out.printf("%nSum of all  scores 10 is %d%n", sum);
		System.out.printf("Average is %.2f%n", average);

}
	}

