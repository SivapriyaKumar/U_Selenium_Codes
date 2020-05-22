package E2E_Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart_Automation {

	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String[] vegsNeeded = {"Brocolli","Carrot","Cucumber"};	
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(2000L);
		
		addToCart(driver,vegsNeeded);
		
	}

	public static void addToCart(WebDriver driver, String[] vegsNeeded)
	{
		List<WebElement> gkVegProducts = driver.findElements(By.cssSelector("h4.product-name"));
		
		int count=0;
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		for ( int i=0;i<gkVegProducts.size();i++)
		{
			String[] gkVegNames = gkVegProducts.get(i).getText().split("-");
			
			String formattedName = gkVegNames[0].trim();
			
			List vegsNeededList = Arrays.asList(vegsNeeded);
			
			if (vegsNeededList.contains(formattedName))
			{
				count ++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(count == vegsNeeded.length)
				{
					break;
				}
			}
		}
	}
	
}
