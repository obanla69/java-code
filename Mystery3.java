import java.util.Scanner;

 	public class Mystery3{
		public static void main(String[] args){
		    int row = 5;

		while (row >= 1) {
		   int column = 5;
			
		   while(column >= 1) {

			System.out.print(row % 2 == 0 ? "x" : "0");
			++column;

		}
		

		--row;
		System.out.println();

		}

	}


	}  
