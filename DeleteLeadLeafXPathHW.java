package week2.day1.seleniumxpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadLeafXPathHW {

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
			driver.findElement(By.linkText("Find Leads")).click();
			
			//Click on the PhoneTab
			
			WebElement phonenm = driver.findElement(By.xpath("//span[text()='Phone']"));
			phonenm.click();
			
			//Enter the Phone number and find the details of the lead from leadlist
			
			WebElement findphnm = driver.findElement(By.xpath("//input[@id='ext-gen270']"));
			findphnm.sendKeys("1234567890");
			
			
			WebElement fndbutton = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
			fndbutton.click();
			
			//Print the first lead ID after the search and click the same ID
			
			Thread.sleep(3000);
			
			WebElement frstleadid = driver.findElement(By.xpath("//*[text()='Lead ID']//following::table[1]/tbody/tr[1]/td[1]/div/a"));
			String strleadid =frstleadid.getText();
			System.out.println("The first Lead ID of the resulting set is : " + strleadid);
			
			WebElement fname= driver.findElement(By.xpath("//*[text()='Lead ID']//following::table[1]/tbody/tr[1]/td[3]/div/a"));
			String strfrname = fname.getText();
			System.out.println("The first Lead ID of the resulting set FirstName is : " + strfrname);
			
			WebElement lname= driver.findElement(By.xpath("//*[text()='Lead ID']//following::table[1]/tbody/tr[1]/td[4]/div/a"));
			String strlrname = lname.getText();
			System.out.println("The first Lead ID of the resulting set LastName is : " + strlrname);
			
			WebElement cmpname= driver.findElement(By.xpath("//*[text()='Lead ID']//following::table[1]/tbody/tr[1]/td[5]/div/a"));
			String strcmpname = cmpname.getText();
			System.out.println("The first Lead ID of the resulting set CompanyName is : " + strcmpname);
			frstleadid.click();
			
			Thread.sleep(2000);
			
			//Click the delete button
			driver.findElement(By.linkText("Delete")).click();
			Thread.sleep(2000);
			
			//Click the Find Leads again
			driver.findElement(By.linkText("Find Leads")).click();
			Thread.sleep(2000);
			
			//Enter the captured LeadID and Display the Error MSG
			WebElement capturedid = driver.findElement(By.xpath("//input[@id='ext-gen246']"));
			capturedid.sendKeys(strleadid);
			WebElement fname1 = driver.findElement(By.xpath("//input[@id='ext-gen248']"));
			fname1.sendKeys(strfrname);
			WebElement lname1 = driver.findElement(By.xpath("//input[@id='ext-gen250']"));
			lname1.sendKeys(strlrname);
			WebElement cmpname1 = driver.findElement(By.xpath("//input[@id='ext-gen252']"));
			cmpname1.sendKeys(strcmpname);
			//Thread.sleep(2000);
			WebElement findbutton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
			findbutton.click();
			Thread.sleep(3000);
			
			//Close the browser
			driver.close();
			
			
			
			
			
			
			
			
		
	}

}
