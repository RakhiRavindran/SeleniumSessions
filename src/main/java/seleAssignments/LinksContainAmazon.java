package seleAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksContainAmazon {


	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Using Xpath--> a tag links which contains text-Amazon
		By links=By.xpath("//a[contains(text(),'Amazon')]");
		List<WebElement>linksList=getELements(links);
		System.out.println(linksList.size());
		int count =0;
		for (WebElement e : linksList) {
			count++;
			System.out.println(count+" "+e.getText());
			
			
		}
		
		//Capture all links and get text--Amazon
	/*  By allLink=By.tagName("a");
		List<WebElement>allLinksList=getELements(allLink);
		System.out.println(allLinksList.size());
		int count =0;
		for (WebElement e : allLinksList) {
			String text=e.getText();
			if(text.contains("Amazon")) {
				count++;
				System.out.println(count+" "+text);
			}
		}*/
		
	}
	private static List<WebElement> getELements(By locator) {
		
		return driver.findElements(locator);
	}

}
