package seleAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspnCircInfo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/new-zealand-in-india-2022-23-1348633/india-vs-new-zealand-1st-t20i-1348649/full-scorecard");
		Thread.sleep(3000);
		getScoreCard("Mitchell Santner");
		
		
	}
	private static void getScoreCard(String cName) {
		List<WebElement>eleList=driver.findElements(By.xpath("//span[text()='"+cName+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String>scoreLists=new ArrayList<String>();
		for (WebElement e : eleList) {
			scoreLists.add(e.getText());
		}
		System.out.println(scoreLists);
	}

}
