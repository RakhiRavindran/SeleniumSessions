package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeloterWithAssignment {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email=By.name("email");
		By Pw=By.id("input-password");
		
		String emailText=aboveElement(email);
		System.out.println(emailText);
		
		String passwText=aboveElement(Pw);
		System.out.println(passwText);
		
		
	}
	private static String aboveElement(By locator) {
		
		WebElement ele=driver.findElement(with(By.tagName("label")).near(getElement(locator)));
		return ele.getText();
	}
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

}
