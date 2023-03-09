package seleniumBasics;

import org.openqa.selenium.By;

public class CustomXpath_CG_childToParent_Sibilings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Xapth captured group for drop down options-->particular position
		By dd=By.xpath("(//select[@name='Country']/option)[position()=10]");
		
//Xpath captured group and particular without position keyword		
		By dd1=By.xpath("((//div[@class='footer-main'])[last()]//a)[2]");
		
//Xpath captured group for last link in footer link-->Last link		
		By lastLink=By.xpath("((//div[@class='footer-main'])[last()]//a)[last()]");
		
//Last() with second last element
		By lastLink1=By.xpath("((//div[@class='footer-main'])[last()]//a)[last()-1]");
		
		
//*********child to immediate parent-->child xpath/..
		By loc1=By.xpath("//input[@id='input-firstname']/..");
		
//*********child to first root node-->child xpath/../../../.. and so on
		By loc2=By.xpath("//input[@id='input-firstname']/../../../.. so on");
		
//*********Sibling before element-->element xpath//preceding-sibling::tagname or full xpath of preceding element without//
		By loc3=By.xpath("//input[@name='email']/preceding-sibling::label[@class='control-label']");
		
//*********Sibling after elemnet-->element of xpath/following-sibling::tagname or xpath of following element without //
		By loc4=By.xpath("//label[contains(text(),'E-Mail Address')]/following-sibling::input[@name='email']");
		
		
//*******child to> parent to>child[same syntax for following and preceding]
		By loc5=By.xpath("//a[contains(text(),'deepti gupta')]/../preceding-sibling::td/input[@type='checkbox']");
		By loc6=By.xpath("//a[contains(text(),'deepti gupta')]/parent::td/preceding-sibling::td/input[@type='checkbox']");
		
//******child to any ancestor and to his child***********
		By loc7=By.xpath("(//span[contains(text(),'Washington Sundar')]/ancestor::td[contains(@class,'ds-min-w-max')]/following-sibling::td)[13]");
		
		
		
		
		
		


	}

}
