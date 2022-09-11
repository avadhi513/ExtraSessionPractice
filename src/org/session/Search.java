package org.session;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// Configuration of Webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");

		// Instantiate a Driver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.nobroker.in/");

		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath("//*[@id='listPageSearchLocality']"));
		sel.click();
		sel.sendKeys("Mumbai");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		WebElement rad1 = driver.findElement(By.id("RENT"));
		rad1.click();
		WebElement search = driver.findElement(By.xpath("//*[@class='prop-search-button btn btn-primary btn-lg']"));
		search.click();

	}

}
