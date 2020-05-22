package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select drpdwn = new Select(driver.findElement(By.id("dropdown-class-example")));
		drpdwn.selectByValue("option1");
		drpdwn.selectByIndex(2);
		drpdwn.selectByVisibleText("Option3");*/
		
		driver.get("https://www.spicejet.com/");
		Select CurncyDrpdwn = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		CurncyDrpdwn.selectByIndex(2);
		CurncyDrpdwn.selectByValue("INR");
		CurncyDrpdwn.selectByVisibleText("USD");
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select PassngrDrpdwn = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		PassngrDrpdwn.selectByValue("3");
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.close();
		
		

	}

}
