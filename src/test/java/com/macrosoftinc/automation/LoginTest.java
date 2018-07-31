package com.macrosoftinc.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public static void LoginClient() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "D://SafetyFirst/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://teammigrate:18080");
			driver.manage().window().maximize();
			System.out.println("Welcome to Jenkins");
			Thread.sleep(3000);
			driver.quit();
			

		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
}