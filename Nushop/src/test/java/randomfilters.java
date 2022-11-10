import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class randomfilters {

	@Test
	public void  randomization() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("http://rudraraju.nushop.kaip.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@class='css-f6cvfk']")).click();
		Thread.sleep(2000);

		// Product Type Filter
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div")).click();
		Thread.sleep(2000);

		List<WebElement> productType_list = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div/div"));

		int product_type = productType_list.size();

		Random randNum = new Random();
		Set<Integer> set = new LinkedHashSet<Integer>();
		while (set.size() < product_type) {
			set.add(randNum.nextInt(product_type) + 1);
		}
		System.out.println("Random numbers with no duplicates = " + set);
		int curr_index = 0;
		int desi_index = 2;
		for (int j : set) {

			int a = 2;
			while (a <= 2) {
				if (curr_index == desi_index) {

					driver.findElement(
							By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div/div[" + j
									+ "]/div/input"))
							.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div")).click();
					break;
				}
				curr_index++;
				a++;
			}

		}

		Thread.sleep(2000);

		// Size Filter
		driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[2]/div/div[2]/div")).click();
		Thread.sleep(2000);

		List<WebElement> Size_list = driver
				.findElements(By.xpath("//*[@id=\'root\']/div/section/div/div[2]/div/div[2]/div/div/div/div/div"));

		int Size_type = Size_list.size();

		Random randNum1 = new Random();
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		while (set1.size() < Size_type) {
			set1.add(randNum1.nextInt(Size_type) + 1);
		}
		System.out.println("Random numbers with no duplicates = " + set1);
		int curr_index1 = 0;
		int desi_index1 = 5;
		for (int j1 : set1) {

			int a1 = 2;
			while (a1 <= 2) {
				if (curr_index1 == desi_index1) {

					driver.findElement(
							By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div/div/div/div/div[" + j1
									+ "]/div/input"))
							.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\'root\']/div/section/div/div[2]/div/div[2]/div")).click();
					break;
				}
				curr_index1++;
				a1++;
			}

		}

		// Color Filter
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div")).click();
		Thread.sleep(2000);

		List<WebElement> Color_list = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/div/div/div/div"));

		int Color_type = Color_list.size();

		Random randNum2 = new Random();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		while (set2.size() < Color_type) {
			set2.add(randNum2.nextInt(Color_type) + 1);
		}
		System.out.println("Random numbers with no duplicates = " + set2);
		int curr_index2 = 0;
		int desi_index2 = 1;
		for (int j2 : set2) {

			int a2 = 2;
			while (a2 <= 2) {
				if (curr_index2 == desi_index2) {

					driver.findElement(
							By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/div/div/div/div[" + j2
									+ "]/div/input"))
							.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div")).click();
					break;
				}
				curr_index2++;
				a2++;
			}

		}

	
		
		// Popularity Filter
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/button")).click();
		Thread.sleep(2000);

		List<WebElement> pop_list = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/div/div/div"));

		int pop_type = pop_list.size();

		Random randNum3 = new Random();
		Set<Integer> set3 = new LinkedHashSet<Integer>();
		while (set3.size() < pop_type) {
			set3.add(randNum3.nextInt(pop_type) + 1);
		}
		System.out.println("Random numbers with no duplicates = " + set3);
		int curr_index3 = 0;
		int desi_index3 = 3;
		for (int j3 : set3) {

			int a3 = 2;
			while (a3 <= 2) {
				if (curr_index3 == desi_index3) {

					driver.findElement(
							By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/div/div/div["+j3+"]/p"))
							.click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/button")).click();
					break;
				}
				curr_index3++;
				a3++;
			}

		}
		
		//click out side
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section")).click();

	
		 List<WebElement> list_products= driver.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[5]/div/a/div[1]/div/div"));
	     System.out.println("ALL_PRODUCTS");
	     System.out.println(list_products.size());
	     for(int i=1;i<=list_products.size();i++) {
	    	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[5]/div["+i+"]")).click();
	    	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div[3]/section[3]/div/div/div[2]/div/div[1]/button")).click();
	    	 driver.findElement(By.xpath("/html/body/div[3]/div")).click();
	    	 driver.navigate().back();	     
	    	 }
	  
	     driver.navigate().back();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"page-header\"]/div[2]/div/div[3]/a[3]/button/div")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\'root\']/div/div/section/div/div[2]/div[2]/div[2]/a/button")).click();
		    Thread.sleep(5000);
		    //whatsup number
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div[1]/div/div/input"))
					.sendKeys("9876543210");
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
					.sendKeys("Kuppam near TB road opposite autombile store           ");
			System.out.println("Place of Delivery");
			Thread.sleep(2000);

	// Save and continue
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div/div[6]/div/button")).click();
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

