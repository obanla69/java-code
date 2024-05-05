import java.util.Scanner;

	public class Zero{

		public static void main(String[] args){

		Scanner input = new Scanner (System.in);

			int total = 0;
			int gradeCounter =0;

		System.out.print("Enter the first grade :");
		int grade = input. nextInt();		

	while(grade != -1){

	total = total + grade;
	gradeCounter = gradeCounter + 1;


	System.out.print("Enter grade or -1 to quit: ");

	grade = input.nextInt();



}


	if(gradeCounter != 0){
	
	double average = (double) total / gradeCounter'

	System.out.printf("%nTotal of the %d grade entered is %d%n," grdaeCounter, total);

	System.out.printf("Class average is %. 2f%n," avaerage);

else{

	System.out.println("No grade were entered");

}



}

}



}