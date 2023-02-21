package practiceprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class amazon1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Select dropdown=new Select(driver.findElement(By.id("searchDropdownBox")));
		List option =dropdown.getOptions();
		System.out.println(option.size());
		dropdown.selectByVisibleText("Books");
	
		Thread.sleep(2000);
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		for(int i=1;i<=6;i++)
		{
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		}
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		dropdown.selectByIndex(4);
		Thread.sleep(3000);
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
