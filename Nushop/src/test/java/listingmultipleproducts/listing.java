package listingmultipleproducts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class listing {
	
	@Test
	public void Listing_products() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajum\\Desktop\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://rudraraju.nushop.kaip.in/");
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 2000)"); 
	        List<WebElement> list_products= driver.findElements(By.xpath("//*[@id=\'main\']/section[4]/div/div[2]/div/div"));
	     System.out.println("ALL_PRODUCTS");
	     System.out.println(list_products.size());
	     Thread.sleep(2000);
	     

	     
	   for (int i=1;i<=list_products.size();i++) {
		   driver.findElement(By.xpath("//*[@id=\'main\']/section[4]/div/div[2]/div/div["+i+"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@class='css-tqgrr9']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("/html/body/div[3]/div")).click();
		   driver.navigate().back();
	  
	   
	   
	    	
	    }
	}
}

