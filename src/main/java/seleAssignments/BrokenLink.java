package seleAssignments;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String url= link.getDomAttribute("href");
			isBroken(url);
		}
		

	}
	private static void isBroken(String url) {
		// TODO Auto-generated method stub
		try{
		URL link=new URL(url);
		HttpURLConnection hConnection= (HttpURLConnection)link.openConnection();
		hConnection.setConnectTimeout(3000);
		hConnection.connect();
		if(hConnection.getResponseCode()==200) {
			System.out.println(url+"-"+ hConnection.getResponseMessage());
		}
		else {
			System.out.println(url+"-"+ hConnection.getResponseMessage());
		}

	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
