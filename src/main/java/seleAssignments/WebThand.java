package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebThand {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/west-indies-in-pakistan-2024-25-1442208/pakistan-vs-west-indies-2nd-test-1442219/full-scorecard");
		Thread.sleep(3000);
		System.out.println(getScore("Muhammad Hurraira",1));
	}
	private static String getScore(String name,int i) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		return driver.findElement(By.xpath("(//span[text()='"+name+"']/ancestor::td/following-sibling::td[@class='ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right ds-text-typo']/strong)["+i+"]")).getText();
	}

}
