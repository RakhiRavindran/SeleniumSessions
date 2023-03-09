package seleAssignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedDDValue {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		By dd=By.xpath("//select[@id='Form_getForm_Country']/option");
		
		getDDtextsList(dd,"India");
		
	/*  Select select=new Select(driver.findElement(By.id("Form_getForm_Country")));
		select.selectByVisibleText("India");
		List<WebElement>dd=select.getAllSelectedOptions();
		for (WebElement e: dd) {
			System.out.println(e.getText());
		}
	*/
	}
	
	public static void getDDtextsList(By locator,String country) {
		
		List<WebElement>ddOptionsList=getElements(locator);
		for(WebElement e:ddOptionsList) {
			String text=e.getText();
			if(text.equalsIgnoreCase("India")) {
				e.click();
				if(e.isSelected()) {
					System.out.println(text);
				}
				break;
			}
		}
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		 
	}

}
