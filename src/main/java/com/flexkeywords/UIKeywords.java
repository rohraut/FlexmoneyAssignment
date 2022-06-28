package com.flexkeywords;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords  {
	public static RemoteWebDriver driver = null;


	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else {
			System.err.println("Invalid browseName");
		}

	}
	
	public static void launchURL(String url) {
		 driver.get(url);

	}


	public static void closeBrowser() {
		driver.close();
		
		
	}
	public static void WaitForWebElement(long duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(duration));

	}
	

}
