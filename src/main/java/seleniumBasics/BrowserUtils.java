package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
	
	private WebDriver driver;//its private so that users is not possible to access it on testclass directly
	
	public WebDriver intiDriver(String browserName) {
		
		switch (browserName.toLowerCase().trim()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
				
			default:
				System.out.println("enter valid browser name");
				break;
			}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
			
		
		return driver;//why it is returning ? ans: in upcoming chapters
		/* when this webdriver object is returning to the class where it is called the intiDriver() method,
		 then in that class it will be using the same webdriver object[may be with
		different ref.name/same name specific to that class] with same session ID
		*/
	}
	
	public void launchURL(String url) {

		if(url==null) {
			System.out.println("This is null");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
		
	}
	
	public String getPageTitle() {
		String title=driver.getTitle();
		System.out.println("Te current page title is:"+title);
		return title;
	}
	
	public String getPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("The current page url is:"+url);
		return url;
	}
	
	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
	

}
