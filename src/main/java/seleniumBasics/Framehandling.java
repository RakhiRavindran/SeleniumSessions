package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	
//The method frame is an overloaded method
//frame method with index
//frame method with attribute value[name or id value]
//frame with webElement > create webElement with xpath
	
	//driver.switchTo().frame(2);
	//driver.switchTo().frame("main");
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
	WebElement header=driver.findElement(By.xpath("//h2[contains(text(),'Title bar' )]"));
	System.out.println(header.getText());
	
	
//if driver want to switch back to default page
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='home.html']")));
	WebElement header1=driver.findElement(By.xpath("//h1[text()='Example home page ']"));
	System.out.println(header1.getText());
	
		
	}

}
