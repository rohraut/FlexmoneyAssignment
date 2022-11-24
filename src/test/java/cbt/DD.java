package cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD {
	@Test
	public void dropdownDemo() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		WebElement wb1 =driver.findElement(By.xpath("//h5[text()=\"Java full stack Development\"]"));
		WebElement wb2 =driver.findElement(By.xpath("//h5[text()=\"Automation testing (java) \"]"));
		WebElement wb3 =driver.findElement(By.xpath("//h5[text()=\"Automation testing (Python)\"]"));
		WebElement wb4 =driver.findElement(By.xpath("//h5[text()=\"MERN full Stack Development\"]"));
		WebElement wb5 =driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(wb1, wb5).perform();
		a.dragAndDrop(wb2, wb5).perform();
		a.dragAndDrop(wb3, wb5).perform();
		a.dragAndDrop(wb4, wb5).perform();

	}

}
