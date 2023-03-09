package seleAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksLocatesByTitle {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		selectFooterTitle("My Account");
		
	}
	
	private static void selectFooterTitle(String footerTitle) {
		
		By locator=By.xpath("//div[@class='row']//h5[text()='"+footerTitle+"']/following-sibling::ul//a");
	    List<WebElement> selectedFooterLinksList=driver.findElements(locator);
	    for (WebElement e : selectedFooterLinksList) {
			System.out.println(e.getText());
		}
	}

}
