package E2E_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cleartrip.com/");
	
				
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class*= 'ui-state-active']")).click();
		
		
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByValue("4");
		
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByIndex(1);
		
		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByVisibleText("1");
		

		driver.findElement(By.id("MoreOptionsLink")).click();
		
		Select ClsOfTrvl = new Select(driver.findElement(By.id("Class")));
		ClsOfTrvl.selectByValue("Business");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("CityJet");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		WebElement err_msg = driver.findElement(By.id("homeErrorMessage"));
		System.out.println(err_msg.getText());
		
	}

}
