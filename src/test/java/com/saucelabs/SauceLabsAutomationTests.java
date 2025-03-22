package com.saucelabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabsAutomationTests {
public static WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test 

	public void LonginintoSauceLabs() throws InterruptedException{ 
		WebElement username=driver.findElement(By.xpath("//input[@name='user-name']"));
		username.click();
		username.sendKeys("standard_user");
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("secret_sauce");
		Thread.sleep(5000);
		
		WebElement loginbtn=driver.findElement(By.xpath("//input[@value='LOGIN']"));
		loginbtn.click();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


}
