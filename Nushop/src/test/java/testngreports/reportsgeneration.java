package testngreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class reportsgeneration {
	protected ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	
	@BeforeTest
	public void reports() {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		}
	@Test(priority=1)
	public void login() {
		ExtentTest test = extent.createTest("login","This test will exture for placing order for searched product");

		
		System.out.println("login successfull");
	
	}
	@Test(priority=2)
	public void namepage() {
		ExtentTest test = extent.createTest("namepage","This test will exture for placing order for searched product");

	System.out.println("entering details page");
	
	} 
  @Test(priority=3)
   public void successfulpage() {
		ExtentTest test = extent.createTest("success","This test will exture for placing order for searched product");

	System.out.println("entering details page");
	
}
  
  @AfterTest
  public void Tear() {
	  extent.flush();
  }

}


