package E2E_Assignments;
import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
	    System.out.println(driver.getTitle());
		
	    Thread.sleep(2000L);
	    Select fromplace = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
	    fromplace.selectByValue("BLR");
	    
	    
	    /*driver.findElement(By.cssSelector("input[value*='MAA']")).click();
	    
	    Select toplace = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
	    toplace.selectByValue("MAA");*/
	    
	    Select CurncyDrpdwn = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		CurncyDrpdwn.selectByIndex(2);
		CurncyDrpdwn.selectByValue("INR");
		CurncyDrpdwn.selectByVisibleText("USD");

		
		Thread.sleep(2000L);
		
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select PassngrDrpdwn = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		PassngrDrpdwn.selectByValue("3");
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	    
	    System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    
	}

}
