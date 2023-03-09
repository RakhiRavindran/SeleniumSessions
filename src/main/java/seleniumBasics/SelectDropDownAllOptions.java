package seleniumBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		/*Select select=new Select(driver.findElement(By.id("Form_getForm_Country")));
		List<WebElement> countryOptions=select.getOptions();//fetch all the values in dropdown
		System.out.println(countryOptions.size-1);
		for(WebElement e: countryOptions) {
			if(e.getText().equals("India")) {
				e.click();
				break;
			}
			
		}*/
		
		By countryEle=By.id("Form_getForm_Country");
		//getDropDownOptionsList(countryEle);
		System.out.println("expected options count is "+ (getDropDownOptionsCount(countryEle)-1));
		
		List<String> exeCountryList=Arrays.asList("Brazil","India","Armenia");
		
		if(getDropDownOptionsListText(countryEle).containsAll(exeCountryList)) {
			System.out.println("Actual country list are as expected");
		}
		
		SelectDropDownOption(countryEle,"India");
		
		
		driver.quit();
		
	}
	
	public static void SelectDropDownOption(By locator,String option) {
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		for(WebElement e: optionsList) {
			String text=e.getText();
			if(text.equals(option)) {
				e.click();
			}
		}
	}
	
	public static List<String> getDropDownOptionsListText(By locator) {
		List<WebElement>optionsList=getDropDownOptionsList(locator);
		List<String>optionsListTexts=new ArrayList<String>();
		
		for(WebElement e: optionsList) {
			String text=e.getText();
			optionsListTexts.add(text);		
		}
		return optionsListTexts;
	}
	
	public static int getDropDownOptionsCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
