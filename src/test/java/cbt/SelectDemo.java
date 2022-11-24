package cbt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {
	@Test
	public void dropDown() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		driver.manage().window().maximize();
		WebElement wb =driver.findElement(By.xpath("//select[@class=\"multi-select\"]"));
		
		Select select = new Select(wb);
		try {
			select.selectByVisibleText("Core Java");
			select.selectByVisibleText("Selenium WebDriver");
			select.selectByVisibleText("Selenium Grid");
			select.selectByVisibleText("REST API Automation");
			select.selectByVisibleText("Performance Testing using Jmeter");
			List<WebElement> list =select.getAllSelectedOptions();
			for (WebElement webElement : list) {
				String tags = webElement.getText();
				System.out.println(tags);
				
			}
			System.out.println("element found");
		} catch (Exception e) {
			System.out.println("no element found");
		}
		
		//select.selectByIndex(10);
		

	}

}
