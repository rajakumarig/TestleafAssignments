package week2.day1.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadXPath {

	public static void main(String[] args) throws InterruptedException {
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
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
		//Update the details using Xpath and create an account
			
			WebElement cmpyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
			cmpyname.sendKeys("TestLeaf Online course");
			
			WebElement frstname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
			frstname.sendKeys("Rajakumari");
			
			WebElement lstname = driver.findElement(By.xpath("(//input[contains(@id,'createLeadForm')])[4]"));
			lstname.sendKeys("Ganesh");
			
			WebElement frstlocal = driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]"));
			frstlocal.sendKeys("Raji");
			
			WebElement dpt = driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
			dpt.sendKeys("JAVA WITH SELENIUM");
			
			WebElement desc = driver.findElement(By.xpath("//textarea[contains(@id,'createLeadForm_description')]"));
			desc.sendKeys("Its a online course for both freshers and experienced people");
			
			WebElement email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
			email.sendKeys("rajakumarig90@gmail.com");
			
			WebElement state = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvinceGeoId')]"));
			Select statedrpdwn = new Select(state);
			statedrpdwn.selectByVisibleText("New York");
			
			WebElement crtbutton = driver.findElement(By.xpath("//input[contains(@name,'submitButton')]"));
			crtbutton.click();
			
			WebElement edit = driver.findElement(By.linkText("Edit"));
			edit.click();
			
			Thread.sleep(2000);
			WebElement upddesc = driver.findElement(By.xpath("//textarea[contains(@id,'updateLeadForm_description')]"));
			upddesc.clear();
			
			WebElement impnote = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']"));
			impnote.sendKeys("No Comments");
			
			WebElement updbutton = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
			updbutton.click();
			
			// To get the current title of the Page
			   String currentTitle = driver.getTitle();
		    //Print the Title of the page
		       System.out.println("Current Title is:"+currentTitle);
		       
		      driver.close();

			
			
	}

}
