package testNGsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumBasics.WebdriverBasics;

public class PBase_Test {
	
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void setup(String browser,String url) {
		if(browser.trim().equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		if(browser.trim().equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		if(browser.trim().equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
