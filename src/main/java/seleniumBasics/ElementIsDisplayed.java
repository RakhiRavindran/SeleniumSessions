package seleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {// If element is not found then it will throws an exception like
								// NoSuchElementException =>NSE exception
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.linkText("Prime"));
		boolean flag=ele.isDisplayed();
		if(flag) {
			System.out.println("Prime is available");
			ele.click();
			
		}
		//or generic methods
		By logo=By.id("nav-logo-sprites");
		By textBox=By.name("field-keywords");
		By sIcon=By.className("nav-search-submit-text");
		
		if(doElementIsDisplayed(logo)) {
			System.out.println("Logo is present");
		}
		if(doElementIsDisplayed(textBox)) {
			doSendKeys(textBox,"iPhnome");
		}
		if(doElementIsDisplayed(sIcon)) {
			doClick(sIcon);
		}
		
		
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}

	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

}
