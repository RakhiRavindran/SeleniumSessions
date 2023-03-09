package seleAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoTextBoxesInRegForm {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By textBox=By.xpath("//input[contains(@id,'input')]");
		getTextBoxSize(textBox);
		
	}
	
	public static void getTextBoxSize(By locator) {
		List<WebElement>textBoxList =getElement(locator);
		System.out.println(textBoxList.size());
		
	}
	
	public static List<WebElement> getElement(By locator){
		return driver.findElements(locator);
		
	}

}
