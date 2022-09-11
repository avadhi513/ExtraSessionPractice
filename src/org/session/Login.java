package org.session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.nobroker.in/");

		WebElement log = driver.findElement(By.xpath("//*[@class='nb__19hcF']"));
		log.click();

		WebElement PhnNo = driver.findElement(By.xpath("//*[@class='form-control']"));
		PhnNo.sendKeys("8210455911");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		WebElement PassRad = driver.findElement(By.xpath("//*[@id='login-signup-form-login-radio-password']"));
		ac.moveToElement(PassRad).perform();
		PassRad.click();

		WebElement Pass = driver.findElement(By.xpath("//*[@id='login-signup-form__password-input']"));
		Pass.sendKeys("aast209");

		WebElement Con = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		Con.click();

	}

}
