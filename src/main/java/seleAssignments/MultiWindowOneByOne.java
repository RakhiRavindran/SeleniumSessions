package seleAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowOneByOne {

	static WebDriver driver;
	static String parentID;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		parentID=driver.getWindowHandle();
		
		Thread.sleep(3000);
		By linkedIn=By.xpath("//a[contains(@href,'linkedin')]");
		doClick(linkedIn);
		doWindowHandles();
			
		
		By fb=By.xpath("//a[contains(@href,'facebook')]");
		doClick(fb);
		doWindowHandles();
		
		//By twitter=By.xpath("//a[contains(@href,'twitter')]");
		//doClick(twitter);
		
		

	}
	private static void doWindowHandles() throws InterruptedException {
		
		Thread.sleep(3000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		
		while(it.hasNext()) {
		String windowID=it.next();
		if(!windowID.equals(parentID)) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
		driver.switchTo().window(parentID);
		
				
	}
	private static void doClick(By locator) {
		getElement(locator).click();
		
	}
	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
