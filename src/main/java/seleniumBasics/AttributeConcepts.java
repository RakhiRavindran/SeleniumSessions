package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String fnAttValue=driver.findElement(By.name("firstname")).getDomAttribute("placeholder");
		driver.findElement(By.name("firstname")).sendKeys("Arun");
		String textValue=driver.findElement(By.name("firstname")).getDomProperty("value");
		//getDomProperty("value") and getDomAttribute("Attribute name");
		
		System.out.println(textValue);
		System.out.println(fnAttValue);
		
		By ln=By.id("input-lastname");
		By pw=By.id("input-password");
		By logo=By.className("img-responsive");
		
		String phName=getElementAttribute(ln, "placeholder");
		String classPW= getElementAttribute(pw,"class");
		String srcLogo=getElementAttribute(logo, "src");
		System.out.println(phName);
		System.out.println(classPW);
		System.out.println(srcLogo);
		
		//getAttribute for links--multiple links attribute
		
		By links=By.tagName("a");
		By imgs=By.tagName("img");
		getElementsAttribute(links, "href");
		getElementsAttribute(imgs, "src");
		
		
		
		
		
	}
	
	public static void  getElementsAttribute(By locator,String attrName) {
		List<WebElement> eleList= getElements(locator);
		for (WebElement e : eleList) {
			String attrValue=e.getAttribute(attrName);
			System.out.println(attrValue);
		}
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

}
