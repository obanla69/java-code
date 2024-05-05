import java.util.scanner;

	public class Gas{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		

			int per total = 0;
			int pergallon = 0;
		System.out.print("Enter pergallon or -1 to miles:");
		int per gallon = input.nextInt();

		while (pergallon != -1){
			total = total + pergallon;
			pergallon = pergallon + 1;
			
			
			System.out.print("Enter pergallon or -1 to miles:");
			pergallon =input.nextInt();

                }
					
		if (pergallon !=0){

		double average =(double) total / pergallon;
		System.out.printf("%nTotal of the %d pergallon enterned is %dn", pergallon, total);

}	
		else{
			System.out.println("No pergallon entered");


}




}





}