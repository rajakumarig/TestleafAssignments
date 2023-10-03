package week1.day5.seleniumfbhw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAccCreationHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        
        //Maximize the Window
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //Create an account in FB
        WebElement creacc = driver.findElement(By.linkText("Create new account"));
        creacc.click();
        
        //Enter the mandatory details to sign up
        WebElement frstnm = driver.findElement(By.name("firstname"));
        frstnm.sendKeys("Raji");
        
        WebElement lastnm = driver.findElement(By.name("lastname"));
        lastnm.sendKeys("Ganesh");
        
        WebElement phnum = driver.findElement(By.name("reg_email__"));
        phnum.sendKeys("9963183200");
        
        WebElement pwd = driver.findElement(By.id("password_step_input"));
        pwd.sendKeys("Japan@1234");
        
        WebElement day = driver.findElement(By.id("day"));
        Select daydrpdwn = new Select(day);
        daydrpdwn.selectByIndex(7);
        
        WebElement month = driver.findElement(By.id("month"));
        Select monthdrpdwn = new Select(month);
        monthdrpdwn.selectByVisibleText("Jul");
        
        WebElement year = driver.findElement(By.id("year"));
        Select yeardrpdwn = new Select(year);
        yeardrpdwn.selectByVisibleText("1991");
        
        //Select the Gender of the signup using radibutton option
        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),\"Female\")]"));
        boolean ischecked = gender.isSelected();
        
        if(ischecked==false) {
        	gender.click();
         }
        Thread.sleep(2000);
        driver.quit();
	}

}
