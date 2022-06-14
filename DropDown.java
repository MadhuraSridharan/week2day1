package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("dropdown1"));
		Select dd=new Select(ele);
		dd.selectByIndex(1);
		WebElement ele1 = driver.findElement(By.name("dropdown2"));
		Select dd1=new Select(ele1);
		dd1.selectByVisibleText("UFT/QTP");
		WebElement ele2 = driver.findElement(By.name("dropdown3"));
		Select dd2=new Select(ele2);
		dd2.selectByValue("2");
		WebElement ele3 = driver.findElement(By.className("dropdown"));
		Select dd3=new Select(ele3);
		List<WebElement> options = dd3.getOptions();
		for(int i=0;i<options.size();i++)
		{
			WebElement elem = options.get(i);
			String text = elem.getText();
			System.out.println(text);
		}
		
		WebElement ele4=driver.findElement(By.className("example"));
		ele4.sendKeys("Loadrunner");
			
		Thread.sleep(5000);
		//driver.close();
		
		

		

	}

}
