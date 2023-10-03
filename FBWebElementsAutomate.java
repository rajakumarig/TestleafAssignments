package week1.day4.seleniumhomework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBWebElementsAutomate {

	public static void main(String[] args) throws InterruptedException{
		
		//Allow popup Notifications
		
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		
		//Instantiate the web browser
		ChromeDriver driver = new ChromeDriver(p);
       
		//Navigate to the browser
		driver.get("https://www.facebook.com");
		
		//Enter the username and Pwd using Webelements
		WebElement usrname = driver.findElement(By.id("email"));
		usrname.sendKeys("testmail123@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Germany@123");
		
		//Find the login button and click on it
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
				
		//Click on more Field Options inside "a" tag
		WebElement more = driver.findElement(By.xpath("//a[@aria-label='More']"));
		more.click();
		Thread.sleep(30000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Click on My Account Option
		WebElement myaccount = driver.findElement(By.xpath("//div[@class='xu06os2 x1ok221b']/span[@dir='auto']"));
		myaccount.click();	
		Thread.sleep(2000);
		
		// To get the current URL of the Page
		   String currentTitle = driver.getTitle();
	    //Print the Title of the page
	       System.out.println("Current Title is:"+currentTitle);
	       
	      driver.close();

	
	}
	
	   
}
