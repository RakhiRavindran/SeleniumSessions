package seleAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BtLink {

	public static void main(String[] args) {
		int count=0;
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			if(link.getText().length()==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
