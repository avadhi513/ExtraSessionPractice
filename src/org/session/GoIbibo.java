package org.session;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbibo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.goibibo.com/hotels/");
		Thread.sleep(5000);
		
		// to select India/international
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[1]/input"));
		btn.click();
		Thread.sleep(5000);
		
		// to select city
		WebElement se = driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]"));
		se.click();
		se.sendKeys("Mumbai");

		Thread.sleep(5000);
		
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN); 
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}

}
