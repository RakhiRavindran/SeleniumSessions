package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//it is not a JS popup
//This authentication pop up will appeared while loading the URL itself
//SwitchTo and sendKey won't work here
//Username and pw	should pass along with the url ex- https://username:pw@urll
//After https://-->enter username:pw@
//if username or pw have '@' character then and that case it wont these method won't works
		

	}

}
