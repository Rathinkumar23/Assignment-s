package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rathin");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("8344851575");
		driver.findElement(By.id("password_step_input")).sendKeys("Rathin85");
		
	    //By getting webElement
		WebElement option = driver.findElement(By.id("day"));
		Select value=new Select(option);
		// To getting method
		value.selectByVisibleText("23");
		WebElement option1 = driver.findElement(By.id("month"));
		Select value1=new Select(option1);
		value1.selectByVisibleText("Sep");
		WebElement option3 = driver.findElement(By.id("year"));
		Select value3=new Select(option3);
		value3.selectByVisibleText("1998");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		
		
		
		
		
	}

}
