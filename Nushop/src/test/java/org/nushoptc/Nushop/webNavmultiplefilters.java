package org.nushoptc.Nushop;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class webNavmultiplefilters {
	@Test
	public void website_navigator() throws InterruptedException, IOException {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
	ExtentTest test = extent.createTest("Search product ordering","This test will exture for placing order for searched product");
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://rudraraju.nushop.kaip.in/");
	test.log(Status.INFO, "Launching site");
	test.log(Status.PASS, "Site Launched");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/a/div/div/div[3]/a")).click();
	Thread.sleep(3000);
	test.log(Status.INFO, "Cliking on product");
	test.log(Status.PASS, "Clicked on product");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div/div/div/input")).sendKeys("Shirts");
	Thread.sleep(2000);														
	//Search_box
	List<WebElement> Search_Results_List = driver.findElements(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div[3]/div"));
	System.out.println("Search_Results_List");
	System.out.println("listed =  " + Search_Results_List.size());
	test.log(Status.INFO, "Searching A product");
	test.log(Status.PASS, "searched for a product");
	//Random random = new Random(); 
	//int  = random.nextInt(50);
	for (int i=1;i<=Search_Results_List.size();i++)
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div[3]/div["+i+"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div[3]/section[3]/div/div/div[2]/div/div[1]/button")).click();
		Thread.sleep(2000);
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
		test.log(Status.INFO, "ENtering whats up number on product");
		test.log(Status.PASS, "Entered");
		test.addScreenCaptureFromPath("screen.png");

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

		extent.flush();
	}
	
	@Test
	public void Multiple_Filters() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("http://rudraraju.nushop.kaip.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on deal price
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/section[5]/div/div[2]/div/div/div[2]/div/a"))).click();
		
		
		//Product Type Filter
		//click on product type
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div"))).click();
		
		List<WebElement> productType_list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div/div/div/label/p"));
		for(int i=0; i<productType_list.size(); i++) {
			System.out.println(productType_list.get(i).getText());
				}
		
		System.out.println("How many filters do you want to apply for product type");		
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int j=1;
		while(j<=a) {
			Scanner sc = new Scanner(System.in);
			 int k = sc.nextInt();
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div/div["+k+"]/div/input")).click();
			 Thread.sleep(1000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div"))).click();
			 j++;
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section")).click();
		
		
		
		//size filter
		//click on size filter
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div"))).click();
		
		List<WebElement> size_list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div/div/div/div/div/div/label/p"));
		for(int i=0; i<size_list.size(); i++) {
			System.out.println(size_list.get(i).getText());
		}
		
		System.out.println("How many filters do you want to apply for Size");		
		Scanner scr1 = new Scanner(System.in);
		int a1 = scr1.nextInt();
		int j1=1;
		while(j1<=a1) {
			Scanner sc = new Scanner(System.in);
			 int k = sc.nextInt();
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div/div/div/div/div["+k+"]/div/input")).click();
			 Thread.sleep(1000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div"))).click();
			 j1++;
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section")).click();
		
		
		//Colour filter3
		//click on size filter
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div"))).click();
		
		List<WebElement> Colour_list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/div/div/div/div/div/label/p"));
		for(int i=0; i<Colour_list.size(); i++) {
			System.out.println(Colour_list.get(i).getText());
		}
		
		System.out.println("How many filters do you want to apply for Colour List");		
		Scanner scr2 = new Scanner(System.in);
		int a2 = scr2.nextInt();
		int j2=1;
		while(j2<=a2) {
			Scanner sc = new Scanner(System.in);
			 int k = sc.nextInt();
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/div/div/div/div["+k+"]/div/input")).click();
			 Thread.sleep(1000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div"))).click();
			 j2++;
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section")).click();

		Thread.sleep(2000);
	
	}
	
	
	
	
	@Test
	public  void random() {
		 for (int i=0; i<10;i++){
	            int random = (int)(Math.random()* (50));
	            System.out.println (random);
	    }
	}
	}


