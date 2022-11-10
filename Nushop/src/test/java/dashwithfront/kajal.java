package dashwithfront;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kajal {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nushop-dashboard.kaip.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//enterno
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div/div[2]/form/div[1]/div/div[1]/div/span/span/input")).sendKeys("8888833333");
		Thread.sleep(2000);
		//getotp
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div/div[2]/form/div[3]/div/div/div/button")).click();
		Thread.sleep(2000);
		//enterotp
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div/div[2]/form/div[1]/div/div/div/input")).sendKeys("0000");
	    Thread.sleep(2000);
		//submitotp
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div/div[2]/form/div[2]/div/div/div/button")).click();
		Thread.sleep(2000);
		//placeorder
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/aside/div/ul/li[8]/div")).click();
		Thread.sleep(2000);
		//neworder
		driver.findElement(By.xpath("//*[contains(text(),'New Order')]")).click();
		Thread.sleep(2000);
		//clickdropd
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/main/div/div[3]/div/div/div/form/div[1]/div[2]/div/div/div/div")).click();
		Thread.sleep(2000);
	    for(int i=1;i<=3;i++){
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div["+i+"]"));
	   
	    //custcontno
		driver.findElement(By.xpath("//*[@id=\"customer_number\"]")).sendKeys("7777777777");
		Thread.sleep(2000);
	    //custname
		driver.findElement(By.xpath("//*[@id=\"customer_name\"]")).sendKeys("ujwal");
		Thread.sleep(2000);
		//paymentm
		driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("444303");
		Thread.sleep(2000);
	    //houseno
		driver.findElement(By.xpath("//*[@id=\"house_number\"]")).sendKeys("mh0034567");
		Thread.sleep(2000);
		//street
		driver.findElement(By.xpath("//*[@id=\"addr\"]")).sendKeys("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		Thread.sleep(2000);
		//next
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/main/div/div[3]/div/div/div/form/div[10]/div/div/div/div/div/button/span[1]")).click();
		Thread.sleep(2000);
		//prodname
		driver.findElement(By.xpath("//*[@id=\"product_name\"]")).sendKeys("colg bag");
		Thread.sleep(2000);
		//quantity
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("2");
		Thread.sleep(2000);
		//weight
		driver.findElement(By.xpath("//*[@id=\"weight\"]")).sendKeys("1");
		Thread.sleep(2000);
		//selling
		driver.findElement(By.xpath("//*[@id=\"selling_price\"]")).sendKeys("450");
		Thread.sleep(2000);
		//click
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/main/div/div[3]/div/div/div/form/div[11]/div/div/div/div/div/div/button[2]/span[1]")).click();
		Thread.sleep(2000);
		//shipppart
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[4]/div/div/label/span[1]/input")).click();
		Thread.sleep(2000);
		//confirm
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
	    }







	}
}
