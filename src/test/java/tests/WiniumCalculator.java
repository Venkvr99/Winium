package tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumCalculator {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = null;
//		String notepadApplicationPath = "C://test//notepad.exe";
		String notepadApplicationPath ="C://Windows//System32//notepad.exe";
//		String winiumDriverPath = "./Drivers//Winium.Desktop.Driver.exe"; // To stop winium desktop driver

		/*Process process = Runtime.getRuntime().exec("taskkill/F/IM Winium.Desktop.Driver.exe");
		process.waitFor();
		process.destroy();*/
		DesktopOptions options = new DesktopOptions(); // Initiate Winium Desktop Options
		options.setApplicationPath(notepadApplicationPath); // Set notepad application path
		/*WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(new
				File(winiumDriverPath)).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();*/
//		service.start(); // Build and Start a Winium Driver service
		Thread.sleep(5000);
		driver = new WiniumDriver(new URL("http://localhost:9999"), options); // Start a winium driver
		Thread.sleep(10000);


		Thread.sleep(5000);
		driver.findElement(By.name("Format")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Font...")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Bold")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("OK")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Edit")).sendKeys("Welcome to Winium");
		Thread.sleep(1000);
		driver.findElement(By.name("File")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Save")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("File name:")).sendKeys("NewFile");
		Thread.sleep(1000);
		driver.findElement(By.name("Save")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Close")).click();

	}
}