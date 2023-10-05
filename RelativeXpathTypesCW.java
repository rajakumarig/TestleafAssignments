package week2.day1.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTypesCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("http://leaftaps.com/opentaps/");
	   
	  //Maximize the window
	   driver.manage().window().maximize();
	   
	   WebElement usrname = driver.findElement(By.xpath("//input[@id='username']"));
		usrname.sendKeys("Demosalesmanager");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@class,'Submit')]"));
		login.click();

	}

}
