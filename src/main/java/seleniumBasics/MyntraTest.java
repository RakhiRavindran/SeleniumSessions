package seleniumBasics;

public class MyntraTest {

	public static void main(String[] args) {
		BrowserUtils brUtil=new BrowserUtils();
		String browser="Edge";
		String url="https://www.myntra.com";
		
		brUtil.intiDriver(browser);
		brUtil.launchURL(url);
		
		String actUrl=brUtil.getPageURL();
		if(actUrl.contains("myntra")) {
			System.out.println("URL:it is as expected");
		}
		else {
			System.out.println("URL:it is not expected");
		}
		
		String actTitle=brUtil.getPageTitle();
		if(actTitle.contains("Myntra")) {
			System.out.println("Title is as expected");
		}
		else {
			System.out.println("Title is not expected");
		}
		
		//brUtil.quitBrowser();
		brUtil.closeBrowser();
	}

}
