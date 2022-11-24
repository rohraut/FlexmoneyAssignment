package cbt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	@Test
	public void alertDemo() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com/assignments/prompt");
		driver.findElement(By.xpath("//button[@class=\"alert-btn\"]")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("rohan");
		alert.accept();
		alert.sendKeys("25");
		alert.accept();
	}

}
