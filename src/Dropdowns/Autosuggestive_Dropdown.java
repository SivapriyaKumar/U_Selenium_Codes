package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.cssSelector("p-autocomplete[class*='dirty']")).click();
		driver.findElement(By.cssSelector("p-autocomplete[class*='dirty']")).sendKeys("che");
		driver.findElement(By.cssSelector("p-autocomplete[class*='dirty']")).getText();
		
		
		/*driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000L);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000L);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		/*driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);*/
		driver.close();
		/*driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		*/
		
		

	}

}
