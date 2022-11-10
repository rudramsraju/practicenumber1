import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkoutcommon {
	public void Checkout() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// add to bag
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[5]/div/a/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
//add to bag 2
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/button")).click();
		System.out.println("Added_to_bag");
		Thread.sleep(2000);
//
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[3]/div[2]/div[2]/a/button/div")).click();
		Thread.sleep(2000);

// whatsup number
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div/input"))
				.sendKeys("8309333476");
		System.out.println("Whatsup Number");
		Thread.sleep(2000);

// Conform whatsup number
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[2]/button")).click();
		System.out.println("Conform whatsup number");

// Conform name
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[1]/div/div/input"))
				.sendKeys("rajurudra");
		System.out.println("Basic details_name");

// Conform pincode number
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[2]/div/div/input"))
				.sendKeys("517423");
		System.out.println("Pincode");

// Conform house
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[3]/div/div/input"))
				.sendKeys("10");
		System.out.println("House No");

// Conform place of delivery
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[4]/div/div/textarea"))
				.sendKeys("esrtyuiugfdxdchjkjtyuiyfgghkhjgfuiy");
		System.out.println("Place of Delivery");
		Thread.sleep(2000);

// Save and continue
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[5]/div/button")).click();
		System.out.println("Save and Continue");
		Thread.sleep(2000);

// select cod
		driver.findElement(By.xpath("//*[@id=\'cod\']")).click();
		Thread.sleep(2000);

// place order
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/section/div/div/div[1]/div[2]/div/div/button"))
				.click();
		System.out.println("Place order");
		Thread.sleep(2000);
// entering otp1
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div[1]/input")).sendKeys("0");

// entering otp2
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[2]/input")).sendKeys("0");

// entering otp3
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[3]/input")).sendKeys("0");

// entering otp4
		driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div[4]/input")).sendKeys("0");
		System.out.println("OTP");
		Thread.sleep(2000);

//confirm OTP

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[2]/button")).click();
		System.out.println("Order Successfull");

	}

}
