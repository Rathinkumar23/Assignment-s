package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(1000);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Leads")).click();
//find lead doubt
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.id("ext-gen248")).sendKeys("Rathin");
driver.findElement(By.linkText("Find Leads")).click();
//first lead
driver.findElement(By.xpath("//a[contains(@href,'partyId=10126')]")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("cisco");
driver.findElement(By.name("submitButton")).click();
driver.close();




	}
}
