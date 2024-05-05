import java.util.Scanner;

		public class Patrick{

			public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Welcome to E store");
			System.out.println("Please enter a name");
			String name = input.nextLine();

			int count = 0;
			int totalCost = 0;
			int item = 1;

			while(count < 10){
			
			System.out.print("Please enter a  price of item  ? :");
			int itemPrice = input.nextInt();
			totalCost += itemPrice;

			double dicount = 10 / 100;

			double priceDiscount = totalCost * 0.1;

			double finalDiscount = totalCost - priceDiscount;
			count ++;
			}
				
			if(totalCost > 200){
			System.out.printf("%nTotal of Discount is %2.f%n");
			}
			else if(totalCost < 200){
			System.out.printf("Discount cost and no discount added");
			}
			System.out.print("Thanks for patronage");						
			System.out.printf("Customer Name: " + name);						
			System.out.printf("Original cost: "+ totalCost +"\n");
}
}



