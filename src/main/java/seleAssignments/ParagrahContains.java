package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagrahContains {
	

	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		By para=By.xpath("//small[starts-with(text(),'Free CRM has ')]");
		WebElement ele=getElement(para);
		System.out.println(ele.getText());
		
		
	}
	private static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
