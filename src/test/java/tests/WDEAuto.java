package tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WDEAuto {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = null;
		
		
		String WDEPath ="C://Users//ag15509//AppData//Roaming//Microsoft//Windows//Start Menu//Programs//Genesys Telecommunications Laboratories//Workspace Desktop Edition//Workspace Desktop Edition (GME UAT).appref-ms";
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(WDEPath);
		Thread.sleep(5000);
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		
		Thread.sleep(5000);
		driver.findElement(By.name("User Name")).clear();
    	driver.findElement(By.name("User Name")).sendKeys("AG15509");
    	driver.findElement(By.className("PasswordBox")).sendKeys("Chan/mon");
    	driver.findElement(By.name("_Log In")).click();
    	driver.findElement(By.className("PagePlaceView")).click();
    	driver.findElement(By.name("OK")).click();
    	driver.findElement(By.id("ButtonReady")).click();
    	driver.findElement(By.name("Ready")).click();
    	
  
    	
		
	}

}
