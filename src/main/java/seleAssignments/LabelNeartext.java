package seleAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class LabelNeartext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement ele =d.findElement(By.xpath("//a[@id='gender-help']"));
		//a[@id='gender-help']
		String s=d.findElement(with(By.className("mtm mbs _2_68")).near(ele)).getText();
		System.out.println(s);
	}

	
}
