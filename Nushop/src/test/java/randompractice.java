import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class randompractice {
	@Test
	public void Random() throws InterruptedException {
		//int a =10;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("http://rudra.nushop.kaip.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div[1]/a/button")).click();
		// Product Type Filter
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div")).click();
				Thread.sleep(2000);
				

				List<WebElement> productType_list = driver
						.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div"));
				System.out.println( productType_list.size() );
	}
	


}

