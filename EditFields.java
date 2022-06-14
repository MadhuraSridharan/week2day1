package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
	
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Madhu");
        driver.findElement(By.xpath("//input[@value='Append ']")).clear();
        
       // driver.findElement(By.id("email")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(value);
		
	
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(enabled);
	
	//driver.get("www.google.com");
	}

}
