import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.assertEquals;


	public class SortingTest{

		@Test	
	 	public void testThatSortingArray(){

		   int[]arrays = {2,9,3,1,6};
		   int [] expectedSum ={1,2,3,6,9} ;
		
		   //assertion
		     assertEquals(expectedSum, arrays);

		}


}