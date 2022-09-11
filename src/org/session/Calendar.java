package org.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {

		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.goibibo.com/hotels/");

		Actions acc = new Actions(driver);
		WebElement mouse = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[1]/div/h4"));
		acc.moveToElement(mouse).perform();
		mouse.click();

		String flag = "false";
		while (flag == "false") {

			if (driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[19]/span"))
					.size() > 0) {

				WebElement date1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[19]/span"));
				date1.click();
				
				flag="true";
				Thread.sleep(3000);
				
			}
			
			else {
				
			}
			
		}

		/*WebElement date1 = driver.findElement(By.xpath(
		  "//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[19]/span"
		  )); date1.click();
		 */

		Thread.sleep(3000);

		WebElement date2 = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li[31]/span"));
		date2.click();

	}

}
