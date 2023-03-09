package testNGsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pelo_Test extends PBase_Test{

	@Test
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Elo");
	}
	
	@Test
	public void unfeildExistTest() {
		Boolean flag=driver.findElement(By.id("outlined-basic")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void isForgotPwExistTest() {
		boolean flag = driver.findElement(By.linkText("Forgot Password?")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
