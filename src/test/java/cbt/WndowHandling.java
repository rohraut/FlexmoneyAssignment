package cbt;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WndowHandling {
	public static RemoteWebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void launchURL() throws InterruptedException {
		driver.get("https://testingshastra.com");
		driver.findElement(By.xpath("(//a[@href=\"https://www.youtube.com/channel/UCg_SUG_BAPtVUvTSKse2xBg\"])[1]"))
				.click();

		String driverWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window1 : allWindows) {
			if (window1 != driverWindow) {
				driver.switchTo().window(window1);

			}
			// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			// driver.findElement(By.xpath("(//input[@rel=\"custom:1016\"])[1]")).sendKeys("QA
			// Automation Engineer");

		}
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Rohan Raut");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//yt-icon[@class=\"style-scope ytd-searchbox\"])[3]")).click();
	}

	// @AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}
