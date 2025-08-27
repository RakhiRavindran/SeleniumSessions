package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	private WebDriver driver;
	/**
	 * 
	 * @param driver
	 * This constructor helps to access the private webDriver and pass the value in browserUtil class to here
	 *  So it maintaine the same sessionId until it calls quit/close
	 */
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public  int getTotalElementsSize(By locator) {
		int eleCount=getElements(locator).size();
		return eleCount;
	}
	
	public void  getElementsAttribute(By locator,String attrName) {
		List<WebElement> eleList= getElements(locator);
		for (WebElement e : eleList) {
			String attrValue=e.getDomAttribute(attrName);
			System.out.println(attrValue);
		}
	}
		
	public String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	

	public List<String> getElementsTextList(By locator) {
		List<String>eleTextList=new ArrayList<String>();
		List<WebElement>eleLinks=getElements(locator);
		for(WebElement e: eleLinks) {
			String eleText=e.getText();
			eleTextList.add(eleText);
		}
		return eleTextList;
	}
	
	public String doElementGetText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//***********************Select based DropDown Utils****************************//
	
	public void doSelectDropDownByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByValue(text);
	}
	
	public void doSelectDropDownByValue(By locator,String Value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(Value);
	}
	
	public void doSelectDropDownByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	//*********** select-get options****************
	//Click an option
	public void SelectDropDownOption(By locator,String option) {
		List<WebElement> optionsList=getDropDownOptionsList(locator);
		for(WebElement e: optionsList) {
			String text=e.getText();
			if(text.equals(option)) {
				e.click();
			}
		}
	}
	
	//get all option's text in the DD
	public List<String> getDropDownOptionsListText(By locator) {
		List<WebElement>optionsList=getDropDownOptionsList(locator);
		List<String>optionsListTexts=new ArrayList<String>();
		
		for(WebElement e: optionsList) {
			String text=e.getText();
			optionsListTexts.add(text);		
		}
		return optionsListTexts;
	}
	
	//get size of DD options
	public int getDropDownOptionsCount(By locator) {
		return getDropDownOptionsList(locator).size();
	}
	
	//get DD options 
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions();
	}
	
	//**************Get drop down options without using Select********************
	
	
	public void getdropDownOptionsWithoutSelect(By locator,String value) {
		List<WebElement>optionsList =driver.findElements(locator);
		for(WebElement e: optionsList)
		if(e.getText().equals(value)) {
			e.click();
		}
	}
	
	

}
