import java.util.Arrays;

	public class TrueFalse{
	 public static void main(String[]args){
	  int[] numbers = {1,2,4,5,7,8,9};
	   boolean[]number = TrueFalse(numbers);
	   System.out.print(Arrays.toString(number));
	   }
	   

	 public static boolean [] TrueFalse(int [] numbers){
	  boolean [] array = new boolean[numbers.length];
	   for(int i = 0; i < numbers.length; i++){
	     if(numbers[i]%2 == 0){
		array[i] = true;
		}
		else if(numbers[i] %2 !=0){
		array[i] = false;

}



}
return array;
  }

}