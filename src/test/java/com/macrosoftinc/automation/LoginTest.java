package com.macrosoftinc.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void LoginClient() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D://SafetyFirst/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://teammigrate:18080");
		driver.manage().window().maximize();
		System.out.println("Welcome to Jenkins");
		Thread.sleep(3000);
	}
}
