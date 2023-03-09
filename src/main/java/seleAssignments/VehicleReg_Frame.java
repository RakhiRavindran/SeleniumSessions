package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleReg_Frame {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

	Thread.sleep(3000);
	By img=By.xpath("//img[contains(@title,'vehicle-registration-forms')]");
	doClick(img);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
	
	
	//textBox("2");//-11
	doSendkeys("2","2020");
	doSendkeys("3","Honda");
	doSendkeys("4","Highlander");
	doSendkeys("5","white");
	doSendkeys("6","17");
	doSendkeys("7","KL58/0000");
	doSendkeys("8","Rakhi");
	doSendkeys("9","HouseHouse");
	doSendkeys("10","CTy");
	doSendkeys("11","ctte");
	doSendkeys("13", "945632");
	doSendkeys("14", "9874563210");
	doSendkeys("15", "r@gmail.com");
	Select s=new Select(driver.findElement(By.id("RESULT_RadioButton-12")));
	s.selectByVisibleText("Florida");
	Thread.sleep(3000);
	driver.findElement(By.id("FSsubmit")).click();

	}
	private static void doClick(By locator) {
		driver.findElement(locator).click();;
		
	}
	private static void doSendkeys(String IDvalue,String year) {
		getElement( IDvalue).sendKeys(year);
		
	}
	private static WebElement getElement(String IDvalue) {
		
		return driver.findElement(textBox(IDvalue));
	}
	private static By textBox(String IDvalue) {
		By locator=By.xpath("//input[@id='RESULT_TextField-"+IDvalue +"']");
		return locator;
		
	}
}
