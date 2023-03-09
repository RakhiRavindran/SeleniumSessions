package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalElementsUsage {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		By links=By.tagName("a");
		int linksCount=getTotalElementsSize(links);
		System.out.println(linksCount);// we can add a validation on count > a value
		doElementsGetText(links);
			
		

	}
	
	public static void doElementsGetText(By locator) {
		List<WebElement>eleList=getElements(locator);
		for(WebElement e:eleList) {
			String eleText=e.getText();
			if(eleText.length()>0) {
			System.out.println(eleText);
			}
		}
		
	}
	public static int getTotalElementsSize(By locator) {
		int eleCount=getElements(locator).size();
		return eleCount;
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
				
	}

}
