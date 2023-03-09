package testNGsessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchProductTest() {
		int amount =100/0;
		System.out.println("earchProductTest-exceuted"+amount);
	}
	
	@Test(dependsOnMethods = "searchProductTest")
	public void addToCartTest() {
		System.out.println("addToCartTesttTest-exceuted");
	}
	
	@Test
	public void makePaymentTest() {
		System.out.println("makePaymentTest-exceuted");
	}
	
	

}
