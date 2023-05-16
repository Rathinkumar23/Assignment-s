package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Leads")).click();
//find lead doubt
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Phone")).click();
driver.findElement(By.name("phoneCountryCode")).clear();
driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
driver.findElement(By.name("phoneNumber")).sendKeys("8344851575");
driver.findElement(By.linkText("Find Leads")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("10035");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
driver.close();









	}

}
