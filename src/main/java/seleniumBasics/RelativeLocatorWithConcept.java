package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;


public class RelativeLocatorWithConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.aqi.in/dashboard/canada");
		driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele= driver.findElement(By.linkText("Vapi, India"));
		
//to find right of ele element
		String textL=driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(textL);
		
//If we import static "relativeLocator.with" manually, we can avoid RelativeLocator.with
//[classname.methodname] an us with directly 
		String textR=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(textR);
		
		String textA=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(textA);
		
		String textB=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(textB);

//near gives the nearest element of ele in range of 100 pixel
//-->it may child/parent/siblings but depends the locator *with(By.tagName("p")*
		String textN=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(textN);
		
		
		
	}

}
