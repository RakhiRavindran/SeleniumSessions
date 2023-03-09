package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();//Top casting with parent interface
		//for cross browser testing
		WebDriver driver=null;
		String browser="edge";
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ff":
			driver=new FirefoxDriver();
			break;
		
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("enter valid browser name");
			break;
		}
		
		
		driver.get("https://google.com");//protocol in URL mandatory but not www
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		if(actTitle.equals("Google")) {
			System.out.println("Title is verified and test got Passed");
		}
		else {
			System.out.println("failed");
		}
		
		driver.quit();
		

	}

}
