package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.partialLinkText("Contacts")).click();
driver.findElement(By.partialLinkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("RATHIN");
driver.findElement(By.id("lastNameField")).sendKeys("KUMAR");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
}

	
}
