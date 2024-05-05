

import java.util.Scanner;
import java.util.Arrays;

	public class Sorting{
		
		public static void main(String[]args){

		  int []arrays = {2,9,3,1,6};
		   int[] numbers = arrays(arrays);
			System.out.print(Arrays.toString(numbers));
		}
		
	 public static int[] arrays(int[]number){
	  
	  for(int counter = 0; counter < number.length; counter++){

		  for(int count = 0; count < number.length; count++){
			 if(number[counter] < number[count ]){
				 number [counter] = number[counter] + number[count];
				 number[count] = number[counter] - number[count];
				 number[counter] = number[counter] - number[count];
				 
				 
			 }
			 
		  }
		 
		
	  }
return number;   
	
}





	}