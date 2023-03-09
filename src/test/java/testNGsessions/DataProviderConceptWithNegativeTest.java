package testNGsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConceptWithNegativeTest {
	WebDriver driver;
	public boolean doLogin(String userName, String password) {

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMesg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		if (errorMesg.contains("Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour")) {
			return true;
		}
		return false;
	}
	
	public void getProduct(String searchProduct, String productName) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(searchProduct);
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
		System.out.println(searchProduct+"-->"+productName );
		
	}
	
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"abc@gmail.com","123"},
			//{" "," "},
			//{" ","2654"},
			{"ra@gmail.com"," "}
				
		};
	}
	
	@DataProvider
	public Object[][] getProductData(){
		return new Object[][] {
			{"Samsung","Samsung Galaxy Tab 10.1"},
			{"MacBook","MacBook Air"},
			{"MacBook","MacBook Pro"},
			{"MacBook","MacBook Pro12"}
		};
	}
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@Test(priority=1)
	public void titleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(dataProvider = "getLoginData",priority=2)
	public void login_NegTest(String userName,String password) {
		boolean flag=doLogin(userName, password);
		Assert.assertTrue(flag);
				
	}
	
	@Test(dataProvider = "getProductData",priority=3)
	public void searchProductTest(String searchProduct, String productName) {
		getProduct(searchProduct, productName);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
