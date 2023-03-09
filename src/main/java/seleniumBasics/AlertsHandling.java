package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		By at=By.id("alertButton");
		By confirmPopUp=By.id("confirmButton");
		By prompt=By.id("promtButton");
		
		doClickButton(at);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		doClickButton(confirmPopUp);
		alert=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		
		
		doClickButton(prompt);
		alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("abcde");
		alert.accept();
		


	}
	private static void doClickButton(By locator) {
		WebElement ele=getElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();
		
	}
	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
