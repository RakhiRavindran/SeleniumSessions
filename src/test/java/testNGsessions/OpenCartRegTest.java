package testNGsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class OpenCartRegTest {
	WebDriver driver;
	By fnLc=By.id("input-firstname");
	By lnLc=By.name("lastname");
	By emailLc=By.xpath("//input[@name='email']");
	By pnlc=By.xpath("//input[@placeholder='Telephone']");
	By pwLc=By.name("password");
	By cpwLc=By.name("confirm");
	By checkB=By.name("agree");
	By button=By.xpath("//input[@type='submit']");
	
	
	public boolean doReg(String fn,String ln, String email, String phone, String pw) {
		doSendkeys(fnLc,fn);
		doSendkeys(lnLc,ln);
		doSendkeys(emailLc,email);
		doSendkeys(pnlc,phone);
		doSendkeys(pwLc,pw);
		doSendkeys(cpwLc,pw);
		doClick(checkB);
		doClick(button);
		if(driver.getTitle().equals("Your Account Has Been Created!")) {
			return true;
		}
		return false;
	}

	private void doClick(By locator) {
		getElement(locator).click();
		
	}

	private void doSendkeys(By locator, String sentData) {
		getElement(locator).clear();
		getElement(locator).sendKeys(sentData);
		
	}

	private WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	@DataProvider
	public Object[][] regData(){
		return new Object[][] {
			{"Heena", "Vaghela", "heena121@gmail.com", "9090909098", "heena@123"},
			{"vinutha", "ravindra", "vinu121@gmail.com", "9090909099", "vinu@123"},
			{"supriya", "bendukuri", "supriya121@gmail.com", "9090909088", "sup@123"},
		};
	}
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(dataProvider = "regData")
	public void regTest(String fn,String ln, String email, String phone, String pw) {
		boolean flag=doReg(fn, ln, email, phone, pw);
		Assert.assertTrue(flag); 
			
		
		
	}
	
	
	
	
	

}
