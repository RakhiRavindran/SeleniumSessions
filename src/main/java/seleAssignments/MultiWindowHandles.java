package seleAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandles {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parent=driver.getWindowHandle();
		
		Thread.sleep(3000);
		By linkedIn=By.xpath("//a[contains(@href,'linkedin')]");
		By fb=By.xpath("//a[contains(@href,'facebook')]");
		By twitter=By.xpath("//a[contains(@href,'twitter')]");
		doClick(linkedIn);
		//doClick(twitter);
		doClick(fb);
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		while(it.hasNext()) {
			String windowID=it.next();
			if(!windowID.equals(parent)) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.close();//closing only the child one by one
			
			}
		}//driver.quit();// here close all window together
			driver.switchTo().window(parent);
			System.out.println(driver.getTitle());
			//driver.quit();
			
		

	}
	private static void doClick(By locator) {
		getElement(locator).click();
		
	}
	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
