import java.util.Scanner;


		public class SalesComission{

			public static void main(String[] args){

				int total = 0;
				int gradeCounter = 0;
				

				Scanner input = new Scanner(System.in);
				int Comission,earning,grossSales,sold1,sold2;
				int sold3,sold4;
				
				System.out.print("Enter the value  items :");
				 int items = input.nextInt();
				
				while(gradeCounter > 4){
				total = total + gradeCounter;
				gradeCounter = gradeCounter + 1;
				
				System.out.print("Enter item >= 4: ");
				 int item = input.nextInt();
				}

				if(gradeCounter > 4){
				int average = total / gradeCounter;
				System.out.printf("%nTotal of d% gradecounter entered is %				d%n",gradeCounter, total);
				}
				int weeklySalary = 200;
				grossSales = items* 239.99 + items* 129.75 + items* 					99.95 + items* 350.89;

				 Comission = grossSales *0.09;		
				earning = weeklySalary + Comission;
				
				System.out.println("value of Comission:" + Comission);
                                System.out.println("value of earning:" + earning);
				System.out.println("value of grossSales:" + grossSales);
				System.out.println("value of WeeklySalary:" + weeklySalary);
				


}







}

