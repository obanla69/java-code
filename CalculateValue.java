import java.util.Scanner;

	public class CalculateValue{

	public static void main(String[]  args){ 

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the value of D: " );

	int D = scanner.nextInt();
	
	int C = 50;

	int H = 30;

	int result = (2*C*D)/H;

	double Q = Math.sqrt( result );

	System.out.println("Output: " + Q);

	

	}

}