package week2.day1.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LeafGroundButtonHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://leafground.com/button.xhtml");
		   
		//Maximize the window
		 driver.manage().window().maximize();
		 
		 WebElement confrmbutt = driver.findElement(By.id("j_idt88:j_idt90"));
		 confrmbutt.click(); 
		 
		 Thread.sleep(2000);
		 
		 String title = driver.getTitle();
		 if(title.contains("Dashboard")) {
			 driver.navigate().back();
		 }
		 
		 //Confirm if the button is disabled
		 WebElement disable = driver.findElement(By.id("j_idt88:j_idt92"));
		 boolean status = disable.isEnabled();
		 System.out.println("The button is disabled: " + status);
		 
		 //Size of the submit button(height and width)
		 
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("The Height of the Position button is : " + height);
		System.out.println("The Width of the Position button is : " + width);
		
		//find the background color
		
		WebElement bcgcolor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
		String color = bcgcolor.getCssValue("background");
		System.out.println("The Background colour of the Save Button is : " + color);
		
		//find the position of the submit button
		
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xypoint = position.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("The Position of X is : " + xvalue);
		System.out.println("The Position of Y is : " + yvalue);
		
		//close the browser window
		driver.close();
		
		
		
		
		
	}

}
