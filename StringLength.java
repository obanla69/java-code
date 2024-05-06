import java.util.Scanner;

	public class StringLength{

	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter A String: ");

	String random = scanner.nextLine();

	int length = random.length();

	System.out.println("The length of the string: " + length);

	}


}