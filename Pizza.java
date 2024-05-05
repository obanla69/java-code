import java.util.Scanner;
   

	public class Pizza{
	  public static void main(String[]args){
		
	   int sapaSize = 4;
	   int smallMoney = 6;
	   int bigBoys = 8;
           int odogwu = 12;
	   int sapaPrice = 2000;
           int smallMoneyPrice = 2400;
           int bigBoysPrice = 3000;
           int odogwuPrice = 4200;

		
	    Scanner scanner = new Scanner(System.in);
	      
		System.out.print(" How many guest do you have : ?");
		 int guest = scanner.nextInt();

		  System.out.print(" what type of pizza "); 
		   String pizza = scanner.next();
			int totalInput = 0;
			int leftOver = 0;
			int price = 0;

			if (pizza.equalsIgnoreCase("sapasize")){
				if(guest % sapaSize != 0){
			 		totalInput = guest / sapaSize + 1;
				}

				else{
					totalInput = guest / sapaSize;
				}
				leftOver = sapaSize * totalInput - guest;
				price = totalInput * sapaPrice;
			}
			

			else if(pizza.equalsIgnoreCase("smallmoney")){
				if(guest % smallMoney != 0){
					totalInput = guest / smallMoney + 1;
				}
		
				else{
					totalInput = guest / smallMoney;

				}			

				leftOver = smallMoney * totalInput - guest;
				price = totalInput * smallMoneyPrice;
			}
				
			else if(pizza.equalsIgnoreCase("bigboys")){
				if(guest % bigBoys != 0){
					totalInput = guest / bigBoys + 1;
				}
			
				else{
					totalInput = guest / bigBoys;

				}

				leftOver = bigBoys * totalInput - guest;
				price = totalInput * bigBoysPrice;
			}
			
			else if(pizza.equalsIgnoreCase("odogwu")){

				if(guest % odogwu != 0){
					totalInput = guest / odogwu + 1;
			}

			else{
				totalInput = guest / odogwu;
				leftOver = odogwu * totalInput - guest;
				price = totalInput * odogwuPrice;
			}
			
			System.out.printf("TotalInput= %d", totalInput);
			System.out.printf("The total price is : %d", price);
			System.out.printf("%Number of leftOver= %d", leftOver);
			
}

}

      }
	