package org.nushoptc.Nushop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dealpricestorefilter {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://rudraraju.nushop.kaip.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//String Store_name= "DEAL_PRICE_STORES";
	String Store_Title =driver.findElement(By.xpath("//*[@id=\"main\"]/section[5]/div/div[1]/p")).getText();
	System.out.println(Store_Title);
	//Deal price store section
	driver.findElement(By.xpath("//*[@id=\"main\"]/section[5]")).click();
	Thread.sleep(2000);
	//Deals under 999 section
	//driver.findElement(By.xpath("//*[@id=\"main\"]/section[5]/div/div[2]/div/div/div[2]/div/a/div/div[1]/img")).click();
	//System.out.println("Under 999 ");
	Thread.sleep(2000);
	//product type section
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/span")).click();
	System.out.println("product_type");
	//jeans filter
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[1]/div/div/div/div/div[2]")).click();
	System.out.println("product_type_Shirts");
	
	// size filter
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div/span")).click();

	
	// free size
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[2]/div/div/div/div/div[2]/div")).click();
	System.out.println("Free_Size");
	Thread.sleep(2000);
	// color filter
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/span")).click();
	// shaded blue
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[3]/div/div/div/div/div[1]/div/label/p")).click();
	System.out.println("Shaded_Blue");
	Thread.sleep(2000);
	
	// price filter
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[4]/div")).click();
	
	// O TO 200
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[4]/div/div/div/div/div[1]/div/input")).click();
	System.out.println("Price_0_to_200");
	Thread.sleep(2000);
	// Popularity
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/button/div/p")).click();
	//
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div[6]/div/div/div/div/div[3]/p")).click();
	Thread.sleep(2000);
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
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[1]/div/div/input")).sendKeys("8309333476");
	System.out.println("Whatsup Number");
	Thread.sleep(2000);
	
	// Conform whatsup number
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div[2]/button")).click();
	System.out.println("Conform whatsup number");
	
	// Conform name
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[1]/div/div/input")).sendKeys("rajurudra");
	System.out.println("Basic details_name");
	
	
	// Conform pincode number
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[2]/div/div/input")).sendKeys("517423");
	System.out.println("Pincode");
	
	// Conform house
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[3]/div/div/input")).sendKeys("10");
	System.out.println("House No");
	
	// Conform place of delivery
	driver.findElement(By.xpath("//*[@id=\'root\']/div[2]/div[2]/form/div/div/div/div[4]/div/div/textarea")).sendKeys("esrtyuiugfdxdchjkjtyuiyfgghkhjgfuiy");
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
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/section/div/div/div[1]/div[2]/div/div/button")).click();
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
	
