	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.assertEquals;
	
	
	public class CalculatorTest{
	

		@Test	
	 	public void testThatCalculatorCanAddTwoPositiveNumbers(){

		   int sum = Calculator.add(2,2);
		   int expectedSum = 4;
		
		   //assertion
		     assertEquals(expectedSum, sum);

		}

		@Test	
	 	public void testThatCalculatorCanSubstractTwoPositiveNumbers(){

		   int substraction = Calculator.substract(5,3);
		   int expectedSubstraction = 2;
		
		   //assertion
		     assertEquals(expectedSubstraction, substraction);

		}
		@Test	
	 	public void testThatCalculatorCanAddTwoNegativeNumbers(){ 


		   int sum = Calculator.add(-2,-2);
		   int expectedSum = -4;
		
		   //assertion
		     assertEquals(expectedSum, sum);

}
			
		@Test	
	 	public void testProductOfNumbers(){

		   int product = Calculator.product(3,5);
		   int expectedProduct = 15;
		
		   //assertion
		     assertEquals(expectedProduct, product);


}
	
	}
			
		