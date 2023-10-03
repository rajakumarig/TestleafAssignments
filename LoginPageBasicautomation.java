package week1.day4.seleniumclasswork;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageBasicautomation {

	public static void main(String[] args) {
		
		// Intialize the Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to the browser
		driver.get("https://www.facebook.com");
		
		//maximise the chrome browser
		driver.manage().window().maximize();
		
		//close the current browser window
		driver.close();
	}

}
