package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("Arun");
		driver.findElement(By.name("lastname")).sendKeys("Ravindran");
		//driver.findElement(By.className("form-control")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("a@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("9874563210");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Test@123");
		
		/*driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		driver.findElement(By.linkText("login page")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);*/
		
		//click() method can be create a generic method
		
		By button= By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By loginLink=By.linkText("login page");
		By fLink=By.partialLinkText("Forgotten");
		By header=By.tagName("h1");
		
		doClick(button);
		doClick(loginLink);
		doClick(fLink);
		
		String headerText=doElementGetText(header);
		System.out.println(headerText);
		//we can use sentkey method as common method:: see elementUtils

	}
	
	public static String doElementGetText(By locator) {
		
		return driver.findElement(locator).getText();
		
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
