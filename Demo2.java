import java.util.Scanner;

	 public class Demo2{
	   public static void main(String[]args){
	
		int i = 0;
		int count = 0;
	Scanner input = new Scanner(System.in);	
	System.out.print("Enter an number: ");
	int number = input.nextInt();



		for(i = 2; i <= number /2; i++){	
		if(number % i == 0){
		count++;
	      break;

		}


	}
		if(count == 0 && number != 1){
		System.out.println(number +" is a true");
		}
		else{
		System.out.println(number + " is false");
		}



}

	}