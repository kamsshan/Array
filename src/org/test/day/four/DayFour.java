package org.test.day.four;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFour {
private static WebElement actCourse;

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91638\\eclipse-workspace\\DayFour\\Lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	Actions actions=new Actions(driver);
	actions.moveToElement(actCourse).perform();
	WebElement mobiles = driver.findElement(By.xpath("//li[@id=\"nav_43\"]"));
	
	
} 
}
