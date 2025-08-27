package testNGsessions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@Test(dataProvider = "getData")
	public void login(String un,String pw ) {
		
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.navigate().refresh();
	}
	@DataProvider
	public Object[][] getData() throws InvalidFormatException, IOException{
	//	try {
			FileInputStream ip= new FileInputStream("C:\\Users\\User\\Desktop\\data.xlsx");
			Workbook book= new WorkbookFactory().create(ip);
			Sheet s= book.getSheet("logindata");
			Object data[][]=new Object[s.getLastRowNum()][s.getRow(0).getLastCellNum()];
			for (int i = 0; i < s.getLastRowNum(); i++) {
				for (int j = 0; j < s.getRow(0).getLastCellNum(); j++) {
					data[i][j]=s.getRow(i+1).getCell(j).toString();
				}
				
			}
			
			
			return data ;
		}// catch (Exception e) {
			// TODO: handle exception
		//}
		//return null;
		
	}


