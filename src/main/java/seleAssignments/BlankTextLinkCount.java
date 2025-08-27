package seleAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankTextLinkCount {


	static WebDriver driver;
	public static void main(String[] args) {
				
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By links=By.tagName("a");
		List<String>textsList=getElementsTextList(links);
		int count=0;
		for(String t:textsList) {
			if(t.length()==0) {
			count++;	
			System.out.println(count+":"+t);
			
			}
		}
		System.out.println("Blank text count is: "+count);
		

	}
	private static List<String> getElementsTextList(By links) {
		List<WebElement>eleList=driver.findElements(links);
		List<String>textsList=new ArrayList<String>();
		for(WebElement e:eleList) {
			String text=e.getText();
			textsList.add(text);
		}
		
		return textsList;
	}

}
