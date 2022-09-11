package org.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayTwoActivity {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");
		
	    // Launch the browser
		WebDriver wd = new ChromeDriver();
					
		// To get specific url
		wd.get("https://demoqa.com/select-menu");
					
		WebElement d = wd.findElement(By.id("cars"));
		Select s = new Select(d);
					
		// Select the option from DropDown
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		s.selectByIndex(0);
					
		// To print the options in the console
		List<WebElement> op = s.getOptions();
		int sz = op.size();
		System.out.println(sz);
					
		// To print all the selected options
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement x : all) {
			System.out.println(x.getText());
		}
					
		// Deselect
		Thread.sleep(3000);
		s.deselectByValue("saab");
		
	}
	
}
