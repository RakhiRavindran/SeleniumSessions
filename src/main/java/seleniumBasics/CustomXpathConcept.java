package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomXpathConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//first syntax -->//tagName[@attribute='value']
		By fname=By.xpath("//input[@id='input-firstname']");
		
//with and,or operators-->//tagName[@attribute1='value1' and @attribute2='value2']
		By loc1=By.xpath("//input[@id='input-lastname' and @placeholder='Last Name']");
		By loc2=By.xpath("//input[@id='input-lastname' or @placeholder='E-Mail']");//will return 2 elements
		
//Xpath using text()-->//tagName[text()='value']
		By lc3=By.xpath("//a[text()='Forgotten Password']");//will gives 2forgotten pw]
				
//Xpath using text() + attribute-->//tagName[text()='value' and @attribute='value			
		By lc4=By.xpath("//a[text()='Forgotten Password' and @class='list-group-item']");//gives only 1 which is under side div class-list group item

//Xpath with contains with attribute-->
		By lc5=By.xpath("//a[contains(@href,'return/add')]");
		
//Xpath with contains with text()-->//tagName[contains(text(),'partial_text_value')]
		By lc6=By.xpath("//p[contains(text(),'By creating an account')]");
		
//Xpath using contains with multiple attribute-->//tag[contains(@attr1,'v') and @attr2='v2']
		By lc7=By.xpath("//input[contains(@placeholder,'Address') and @name='email']");
		
//Xpath using 2 contains-->//tag[contains(@attr1,v1) and contains(@attr2,'v2')]		
		By lc8=By.xpath("//input[contains(@placeholder,'Address') and contains(@class,'control')]");
		
//Xpath with starts-with()-->//tagName[starts-with(text(),'starting text value')]
		By lc9=By.xpath("//p[starts-with(text(),'Try or purchase our software directly ')]");
		By lc10=By.xpath("");

		
		
		

	}

}
