package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args)  throws InterruptedException {
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
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rathin");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Web Application");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("chidambaramrathin@gmail.com");
driver.findElement(By.name("submitButton")).click();
String title =driver.getTitle();
System.out.println(title);

driver.findElement(By.partialLinkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LEAF");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chidambaram");
driver.findElement(By.id("createLeadForm_lastName")).clear();
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramraj");
driver.findElement(By.name("submitButton")).click();
String title1 =driver.getTitle();
System.out.println(title1);

	}

}
