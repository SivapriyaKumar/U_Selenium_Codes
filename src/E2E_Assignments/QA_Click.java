package E2E_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.bytebuddy.description.modifier.SynchronizationState;

public class QA_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SP\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String optn = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(optn);
		
		
		
		Select drpdwn = new Select (driver.findElement(By.id("dropdown-class-example")));
		
		drpdwn.selectByVisibleText(optn);
		
		
		driver.findElement(By.id("name")).sendKeys(optn);
		
		driver.findElement(By.id("alertbtn")).click();

		String actualtxt = driver.switchTo().alert().getText();
		
		Assert.assertEquals(actualtxt, "Hello Option2, share this practice page and share your knowledge");
		
		System.out.println(driver.switchTo().alert().getText());
		
	/* Rahul Sheety's Code
	 * 
	 * 
	 * driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");

}

       

       

     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

       

       



}

	
	 */
	
	}
}
