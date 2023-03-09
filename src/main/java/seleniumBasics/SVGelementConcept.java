package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGelementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgxpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='west virgina']";
		driver.findElement(By.xpath(svgxpath)).click();
		
		/*String svg="//*[local-name()='svg' and @id='map-svg']//*[name()='g' ]//*[name()='path']";
		List<WebElement> ele=driver.findElements(By.xpath(svg));*/
		

	}

}
