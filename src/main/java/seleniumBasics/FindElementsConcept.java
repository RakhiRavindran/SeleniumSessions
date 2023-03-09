package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		/*
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		int size=linkList.size();
		System.out.println(size);
		/*for(int i=0;i<size;i++ ) {
			String text=linkList.get(i).getText();
			System.out.println(text);
		}
		int count=0;
		for (WebElement wEle : linkList) {
			
			String text=wEle.getText();
			if(text.length()>0) {
				count++;
				System.out.println(text);
				
			}
			
		}
		System.out.println("Total no .of blank text="+(size-count));
		*/
		By links=By.tagName("a");
		List<WebElement>linkList= getElements(links);
		for (WebElement e : linkList) {
			String text=e.getText();
			if(text.length()>0) {
			System.out.println(text);
			}
		}
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}

}
