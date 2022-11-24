package cbt;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CBTdemo {

	public static RemoteWebDriver driver = null;

	
	@BeforeMethod
	@Parameters("browsername")
	public void launchBrowser(String BrowserName) {

		if (BrowserName.equalsIgnoreCase("ie")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (BrowserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			System.out.println("Invalid BrowserName");
		}

	}

	@Test
	public static void launchURL() {
		driver.get("https://www.amazon.com");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
