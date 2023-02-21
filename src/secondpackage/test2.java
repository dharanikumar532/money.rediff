package secondpackage;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		Proxy p=new Proxy();
   		 p.setHttpProxy("192.168.4:4444");
 		opt.setCapability("proxy",p);
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		System.out.println(driver.getCurrentUrl());
	}

}
