package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutSelect {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By locator=By.xpath("//select[@id='Form_getForm_Country']/option");
		getdropDownOptionsWithoutSelect(locator,"India");		
		
		
	}
	public static void getdropDownOptionsWithoutSelect(By locator,String value) {
		List<WebElement>optionsList =driver.findElements(locator);
		for(WebElement e: optionsList)
		if(e.getText().equals(value)) {
			e.click();
				
		}
	
	}

}
