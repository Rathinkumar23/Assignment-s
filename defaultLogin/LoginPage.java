package defaultLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	public static void main(String args [] ) throws Exception {
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
		WebElement drop1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select source=new Select(drop1);
		source.selectByVisibleText("Automobile");
		WebElement drop2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select source1=new Select(drop2);
		source1.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		
	
		
		//driver.close();
		
		
		
		
		
		
	}
}
