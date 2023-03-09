package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4feature {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		

	}

}
