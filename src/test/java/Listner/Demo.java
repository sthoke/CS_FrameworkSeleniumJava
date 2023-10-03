package Listner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerName.class)
public class Demo {
  @Test
  public void testOne() {
	  WebDriver driver = new ChromeDriver();  
	  driver.manage().window().maximize();
	  driver.get("https://tutorialsninja.com/demo/");
	  Assert.assertEquals(driver.getTitle(), "Your Store ");
  }
	  @AfterMethod
	  public void testOe(ITestResult result) {
  } 
}
