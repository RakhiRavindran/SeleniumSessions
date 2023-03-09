package seleAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksList {
	
	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By footer=By.xpath("//div[@class='row']//li/a");
		List<WebElement> footerLinkList=getElements(footer);
		for (WebElement e : footerLinkList) {
			String s=e.getText();
			System.out.println(s);
		}
		driver.close();
		
	}
	private static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}

}
