import java.util.Scanner;
		
			public class Song{

		public static void main(String[] args){

		int Christmas;


     Scanner input = new Scanner(System.in);
   System.out.println("Enter a day of Christmas (1-12), and I will sing you a song.");
   	Christmas = input.nextInt();
		

			
   if(Christmas == 1){
   System.out.println("On the " + Christmas + "st day of Christmas, my true love sent to me,"); 
   }
   if(Christmas == 2){
   System.out.println("On the " + Christmas + "nd day of Christmas, my true love sent to me,"); 
   }
   if(Christmas == 3) {
   System.out.println("On the " + Christmas + "rd day of Christmas, my true love sent to me,"); 
   }
   if(Christmas != 1 && christmas !=2 && Christmas !=3 && Christmas <= 12){
   System.out.println("On the " + Christmas + "th day of Christmas, my true love sent to me,"); 
   }
   if(Christmas > 12){
   System.out.println("Bad news!"); 
   }
   
   switch (Christmas) {
        case 12:
            System.out.println("12 drummers drumming,");
        case 11:
            System.out.println("11 pipers piping,");
        case 10:
            System.out.println("10 lords-a-leaping,");
        case 9:
            System.out.println("9 ladies dancing,");
        case 8:
            System.out.println("8 maids-a-milking,");
        case 7:
            System.out.println("7 swans-a-swimming,");
        case 6:
            System.out.println("6 geese-a-laying,");
        case 5:
            System.out.println("5 golden rings,");
        case 4:
            System.out.println("4 calling birds,");
        case 3:
            System.out.println("3 french hens,");
        case 2:
            System.out.println("2 turtle doves,");
        case 1:
            System.out.println("And a partridge in a pear tree!");
            break;
        default:
            System.out.println("There are only 12 days of Christmas!");
            break;
    
}

}

	}