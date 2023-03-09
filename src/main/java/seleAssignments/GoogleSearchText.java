package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		By searchBox=By.name("q");
		doSendKeys(searchBox,"Naveen Automation");
		

	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
