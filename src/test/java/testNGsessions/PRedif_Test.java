package testNGsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PRedif_Test extends PBase_Test{
	@Test
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Rediffmail");
	}
	
	@Test
	public void unfeildExistTest() {
		Boolean flag=driver.findElement(By.id("login1")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void isForgotPwExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgot Password?")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
