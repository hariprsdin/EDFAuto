package com.macrosoftinc.automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;
	@Test
	public static void LoginCase1() throws Exception{

		System.out.println(" Executing SAF urls");
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public static void LoginCase2() throws Exception {

		System.out.println(" Executing SAF urls");
		System.setProperty("webdriver.chrome.driver", "F:\\selenium-files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://teammigrate:18080/#/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("hprasad");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.cssSelector(".btn.btn-login")).click();
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Title1";
		//assertTrue(driver.findElement(By.id("Test")).isEnabled());
		assertEquals(actualTitle, expectedTitle);
		driver.close();
	}
	
	
}