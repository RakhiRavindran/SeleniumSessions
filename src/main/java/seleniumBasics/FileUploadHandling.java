package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandling {

	static WebDriver driver;
	public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/upload-download");
	WebElement ele=driver.findElement(By.id("uploadFile"));
	ele.sendKeys("F:\\wordfile.docx");//Don't do click on it
	
//locate element then sendKeys(path of file with name and extension)
//Applicable only when <tag type='file'> available for particular element to upload file 
	
	
//AutoIT/Sikuli/Robot wont recommended in modern automation
//Robot won't works for windows and headless mode also
	
	

	}

}
