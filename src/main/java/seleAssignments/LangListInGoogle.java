package seleAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LangListInGoogle {
	
	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		By lang=By.xpath("//div[@id='pageFooter']/ul/li");
		List<String>langTextsList=getLangTextList(lang);
		System.out.println(langTextsList);
		List<WebElement>langList=getElements(lang);
		for(WebElement e:langList) {
			if(e.getText().equals("ಕನ್ನಡ")) {
				e.click();
				break;
			}
		}
		
	}
	public static List<String> getLangTextList(By locator) {
		
		List<WebElement>eleList=getElements(locator);
		List<String>textsList=new ArrayList<String>();
		for(WebElement e:eleList) {
			String text=e.getText();
			textsList.add(text);
		}
		
		return textsList;
	}
	public static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}

}
