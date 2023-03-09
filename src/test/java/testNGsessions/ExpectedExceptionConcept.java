package testNGsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
//if applied expectedException along with @Test annotation 
//and exception is equal to the expected one...Then test will pass
//if it is not equal or not applied expextedException, then test will fail if exception occured
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		int a=9/0;
		System.out.println(a);
		
	}

}
