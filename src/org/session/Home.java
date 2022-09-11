package org.session;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Home {

	public static void main(String[] args) throws AWTException, InterruptedException {

		// Configuration of Webdriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");

		// Instantiate a Driver class.
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get("https://www.nobroker.in/");

		WebElement dd = driver.findElement(By.xpath("//*[@class='css-19bqh2r']"));
		dd.click();

		WebElement mum = driver.findElement(By.xpath("//div[contains(text(),'Mumbai')]"));
		mum.click();
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

		WebElement rent = driver.findElement(By.id("RENT"));
		rent.click();

		// apartment type
		WebElement apart = driver.findElement(By.xpath(
				"(//div[@class='css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator'])[2]"));
		apart.click();

		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		// click on search
		WebElement search = driver.findElement(By.xpath("//*[@class='prop-search-button btn btn-primary btn-lg']"));
		search.click();

	}
}
