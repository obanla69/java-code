import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
	


public class PalindromeTest{

		@Test
		public void testIfNumberIsPalindrome(){

		boolean result = palindromeChecker.isPalindrome(11211);
		assertTrue(result);
		}


}
