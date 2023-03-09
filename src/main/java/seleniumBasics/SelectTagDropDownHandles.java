package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandles {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		/*Select select=new Select(driver.findElement(By.id("Form_getForm_Country")));
		select.selectByIndex(10);
		Thread.sleep(3000);
		select.selectByValue("Bahrain");
		Thread.sleep(3000);
		select.selectByVisibleText("India");*/
		
		By eleCountry=By.id("Form_getForm_Country");
		
		doSelectDropDownByIndex(eleCountry, 10);
		Thread.sleep(3000);
		doSelectDropDownByValue(eleCountry,"Bahrain");
		Thread.sleep(3000);
		doSelectDropDownByVisibleText(eleCountry,"India");
				
		

	}
	
	
	public static void doSelectDropDownByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByValue(text);
	}
	
	public static void doSelectDropDownByValue(By locator,String Value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(Value);
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
		
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
