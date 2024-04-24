import java.util.Scanner; 

 
		public class DisplaySeven{  
		 public static void main(String args[]){ 

			for(int i = 0; i < 10; i++){
		 
		   Scanner input = new Scanner(System.in);  
			System.out.print("Enter a digit: ");    
			    int user = input.nextInt();  
 
	switch(user)  
	{  
      case 0:  
        System.out.println(" _ \n| | \n|_|");  
        break; 
 
      case 1:  
        System.out.println("   \n  |\n  |");  
        break; 
 
      case 2:  
        System.out.println(" _ \n _|\n|_ ");  
        break; 
 
      case 3:  
        System.out.println(" _\n _|\n _|");  
        break;
  
      case 4:  
        System.out.println("   \n|_|\n  |");  
        break;  

      case 5:  
        System.out.println(" _ \n|_ \n _|");  
        break; 
 
      case 6:  
        System.out.println(" _ \n|_ \n|_|");  
        break; 
 
      case 7:  
        System.out.println(" _ \n  |\n  |");  
        break; 
 
      case 8:  
        System.out.println(" _ \n|_|\n|_|");  
        break;  

      case 9:  
        System.out.println(" _ \n|_|\n _|");  
        break; 
 
    }  
  }  
}  

}