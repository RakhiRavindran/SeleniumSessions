package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String bName="Chrome";
		String url="https://naveenautomationlabs.com/opencart/index.php?route=account/register";
		
		BrowserUtils brUtils=new BrowserUtils();
		WebDriver driver=brUtils.intiDriver(bName);
		brUtils.launchURL(url);
		String cUrl=brUtils.getPageURL();
		if(cUrl.contains("naveen")) {
			System.out.println("correct url");
		}
		
		ElementUtils eUtil=new ElementUtils(driver);
		
		By fName=By.id("input-firstname");
		By lName=By.name("lastname");
		By emailId=By.xpath("//*[@id=\"input-email\"]");
		By phoneNo=By.xpath("//*[@id=\"input-telephone\"]");
		By pw=By.cssSelector("#input-password");
		By cPW=By.cssSelector("#input-confirm");
		By button= By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By loginLink=By.linkText("login page");
		By fLink=By.partialLinkText("Forgotten");
		By header=By.tagName("h1");
		
		eUtil.doSendKeys(fName, "rakhi");
		eUtil.doSendKeys(lName, "ravi");
		eUtil.doSendKeys(emailId, "r@gmail.com");
		eUtil.doSendKeys(phoneNo, "9856321470");
		eUtil.doSendKeys(pw, "Test@123");
		eUtil.doSendKeys(cPW, "Test@123");
		
		eUtil.doClick(button);
		eUtil.doClick(loginLink);
		eUtil.doClick(fLink);
		eUtil.doClick(header);

	}

	

}
