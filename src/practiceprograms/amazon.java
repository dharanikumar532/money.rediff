package practiceprograms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class amazon {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).click();
		Actions ac=new Actions(driver);
		ac.pause(3000).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("D:\\dharani\\samsung.png"));
		ac.pause(2000).perform();
		driver.close();
	}

}
