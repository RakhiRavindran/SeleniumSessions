package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegTestId {

	public static void main(String[] args) {
		
		String browserName="firefox";
		String url="https://naveenautomationlabs.com/opencart/index.php?route=account/register";
		
		BrowserUtils brUtils= new BrowserUtils();
		WebDriver driver=brUtils.intiDriver(browserName);//here assigning to driver so that
														//the same session id will maintain the browserUtil class to Elementutil class
		
		brUtils.launchURL(url);
		String actTitle=brUtils.getPageTitle();
		if(actTitle.equalsIgnoreCase("Register Account")) {
			System.out.println("Title of the current page is as expected");
		}
		else {
			System.out.println("Title is not as expected");
		}
		
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By emailId=By.id("input-email");
		By phoneNo=By.id("input-telephone");
		By pw=By.id("input-password");
		By conPW=By.id("input-confirm");
		
		
		ElementUtils eleUtils=new ElementUtils(driver);//constructor with parameter is available 
													  //in Elementutil class
		eleUtils.doSendKeys(fName, "Rakhi");
		eleUtils.doSendKeys(lName, "Ravindran");
		eleUtils.doSendKeys(emailId, "rakhi@gmail.com");
		eleUtils.doSendKeys(phoneNo, "9874632105");
		eleUtils.doSendKeys(pw, "Test@123");
		eleUtils.doSendKeys(conPW, "Test@123");



		
	}

}
