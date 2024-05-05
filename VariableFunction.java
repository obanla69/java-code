
	public class ArrayVariableFunction{
	  public static double add(double firstNumber,double secondNumber){
	
		return firstNumber + secondNumber;
	}

	public static double add(double firstNumber,double secondNumber,double thirdNumber){

	 return add(firstNumber,secondNumber,thirdNumber);

}

	public static int add(int length,int numbers){
		int total = 0;


	for(int i = 0; i < length; i++){

	total += numbers;

	}
	
	return total;

	}



}
