package org.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.flipkart.com/");
		
		String title = wd.getTitle();
		System.out.println(title);
		
		String cu = wd.getCurrentUrl();
		System.out.println("Current url is: "+cu);
		
		WebElement el = wd.findElement(By.className("_3704LK"));
				
	    // get window handle
	    String w = wd.getWindowHandle();
	    System.out.println(w);
	    
	    //quit method
		Thread.sleep(3000);
		wd.quit();
		
	}

}
