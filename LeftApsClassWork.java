package week1.day5.seleniumleftapscw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeftApsClassWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximizing window
        driver.manage().window().maximize();
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("Demosalesmanager");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
        
		//Click on the link inside the a-tag
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the create account tab
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Raji Ganesh123456");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement drpdwn1 = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(drpdwn1); 
		industry.selectByIndex(3);

		WebElement drpdwn2 = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(drpdwn2);
		ownership.selectByVisibleText("S-Corporation");

		WebElement drpdwn3 = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(drpdwn3);
		source.selectByValue("LEAD_EMPLOYEE");


		WebElement drpdwn4 = driver.findElement(By.id("marketingCampaignId"));
		Select marketing = new Select(drpdwn4);
		marketing.selectByIndex(7);


		WebElement drpdwn5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(drpdwn5);
		state.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		String text = "Raji Ganesh123456";


		String aname = (driver.findElement(By.partialLinkText("Raji ")).getText());
		if (aname.contains(text))
			System.out.println("account name aleady exist " + aname);
		else
			System.out.println("account name is created successfully " + aname);

		driver.close();
		
	}

}
