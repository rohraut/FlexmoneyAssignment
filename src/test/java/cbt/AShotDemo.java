package cbt;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class AShotDemo {
	@Test
	public void m1() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();

		AShot ashot = new AShot();
		ShootingStrategy st = ShootingStrategies.viewportPasting(3000);
		ashot.shootingStrategy(st);
		Screenshot sc = ashot.takeScreenshot(driver);
		BufferedImage bf = sc.getImage();
		ImageIO.write(bf, "PNG", new File("naukrisnap.png"));

	}

}
