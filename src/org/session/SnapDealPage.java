package org.session;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SnapDealPage {
	  public static void main(String[] args) throws InterruptedException {
	    
	    // Configure driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\ExtraSessionPractice\\driver\\chromedriver.exe");
	    
	    // Launch browser
	    WebDriver driver = new ChromeDriver();
	    
	    // get Methods
	    driver.get("https://www.snapdeal.com/");
	    
	    // get Title
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    // get current url
	    String cu = driver.getCurrentUrl();
	    System.out.println("Current URL:"+cu);
	    
	    // find by Element
	    WebElement ele = driver.findElement(By.className("catText"));
	    ele.click();
	    
	    // get window handle
	    String w = driver.getWindowHandle();
	    System.out.println(w);
	    
	  /*  // close method
	    driver.close(); */
	    
	    
	    //quit method
	    Thread.sleep(5000);
	    driver.quit();
	    
	  }
	}
