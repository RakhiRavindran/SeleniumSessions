package seleAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(4000);
		
		By uName=By.name("username");
		By pw=By.name("password");
		By button=By.xpath("//input[@type='submit']");
		By contact=By.linkText("CONTACTS");
		
		doSendKeys(uName, "newautomation");
		doSendKeys(pw, "Selenium@12345");
		doClick(button);
						
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		doClick(contact);
		
		Thread.sleep(4000);
		
/* 
   By cName= By.xpath(selectUser("Ali khan"));
   By column=By.xpath("//a[contains(text(),'Ali khan')]/parent::td/following-sibling::td");
   List<String>textList=doGetElementText(cName);
   System.out.println(textList); 
 */
		
		
		List<String>detailsList=getUserDetailsList("Ali khan");
		System.out.println(detailsList);
		
		Thread.sleep(3000);
		selectUser("Ali Khan");

	}
	
	private static void selectUser(String name) {
		By checkBox=By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td");
		getElement(checkBox).click();
		
	}

	public static List<String> getUserDetailsList(String name){
		By locator=By.xpath("//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td");
		List<WebElement>eleList=driver.findElements(locator);
		List<String>eleDetailsList=new ArrayList<String>();
		for (WebElement e : eleList) {
			eleDetailsList.add(e.getText());
			
		}
		
		return eleDetailsList;
				
	}
/*	
	public static List<String> doGetElementText(By locator){
		List<WebElement>eleList=driver.findElements(locator);
		List<String>eleTextList=new ArrayList<String>();
		for (WebElement e : eleList) {
			eleTextList.add(e.getText());
		}
		return eleTextList;
	}
		
	public static String selectUser(String name) {
		String a="//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td";
		return a;
	}*/
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
