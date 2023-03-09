package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By sBar=By.xpath("//aside[@id='column-right']//a");
		List<String>sBarEleList= getElementsTextList(sBar);
		System.out.println(sBarEleList.contains("Address Book"));
		System.out.println(sBarEleList);
		
		
	}
	public static List<String> getElementsTextList(By locator) {
		List<String>eleTextList=new ArrayList<String>();
		List<WebElement>eleLinks=getElements(locator);
		for(WebElement e: eleLinks) {
			String eleText=e.getText();
			eleTextList.add(eleText);
		}
		return eleTextList;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	

}
