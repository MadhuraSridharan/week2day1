package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sri");

		Thread.sleep(2000);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MM");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sourcecode");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhura.260688@gmail.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		Select dd=new Select(ele);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("xxxxxx");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//driver.close();
		
		
	}

}
