package Multi_Window_Concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Parent_Child_Wndw_Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions alert = new ChromeOptions();
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(alert);
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//div/a[text()='Click Here']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> itrator = ids.iterator();
		
		String parent_wndw = itrator.next();
		
		String child_wndw = itrator.next();
		
		driver.switchTo().window(child_wndw);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent_wndw);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
				
		

	}

}
