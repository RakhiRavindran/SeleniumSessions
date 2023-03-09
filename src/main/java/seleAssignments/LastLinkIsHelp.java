package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastLinkIsHelp {
	
	//Using capture group
	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By lastLink=By.xpath("((//div[contains(@class,'navFooterLinkCol')] )[last()]//a)[last()]");
		
		WebElement ll=getElement(lastLink);
		if(ll.getText().equalsIgnoreCase("Help")) {
			System.out.println("last link is help");
			ll.click();
		}

		
		
	}
	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
			
	}
	
}
