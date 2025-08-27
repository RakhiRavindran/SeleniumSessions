package seleAssignments;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;




public class SpecifLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
//JavascriptExecutor js= (JavascriptExecutor)driver;
//	WebElement e= (WebElement)js.executeScript("return document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#mostVisited\").shadowRoot.querySelector(\"#container > div:nth-child(1)\") ");
//	e.click();
		Wait<WebDriver> w= new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(StaleElementReferenceException.class);
		
		   
		
		List<WebElement> lanList=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for (WebElement lan : lanList) {
			w.until(ExpectedConditions.elementToBeClickable(lan));
			if(lan.getText().equals("മലയാളം")) {
				lan.click();
				break;
			}
		}
	}

}
