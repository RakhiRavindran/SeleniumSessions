package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1st approach
		driver.findElement(By.id("input-firstname")).sendKeys("Hiten");
		
		//2nd approach
		WebElement lastName=driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Arun");
		
		//3rd approach : create By locator >which won't hit the server while store an object repository
		//locator repository + webelement ref. + action on it
		By emailId=By.id("input-email");
		WebElement eId = driver.findElement(emailId);
		eId.sendKeys("rakhi@gmail.com");
		
		//4th approach: by locator+ generic method to locate element+ action on it
		By phoneNumber = By.id("input-telephone");
		By password =By.id("input-password");
		
		getElement(phoneNumber).sendKeys("99856742310");
		getElement(password).sendKeys("Test@123");
				
		getElement(password).clear();//clearing the data to pass correct data in 5th approach
		
		//5th approach : By locator + generic method for elements+ methods for actions
		By pw =By.id("input-password");
		By conPW= By.id("input-confirm");
		doSendKeys(pw,"Test@123");
		doSendKeys(conPW,"Test@123");
		
		//6th approach creating elementUtil class for maintaining all elements
		//see separate class for this approach
		

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	

}
