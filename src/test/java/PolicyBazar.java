import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PolicyBazar {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(o);
		
		driver.manage().window().maximize();
driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement signIn = driver.findElement(By.className("sign-in"));
		signIn.click();
		Thread.sleep(1000);
		 WebElement mobNo = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
		 mobNo.sendKeys("9623153925");
		 Thread.sleep(1000);
		 WebElement signinWithpassWord = driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]"));
		 signinWithpassWord.click();
		 Thread.sleep(1000);
		 WebElement passWord = driver.findElement(By.name("password"));
		 passWord.sendKeys("raju@2811");
		 Thread.sleep(1000);
		 WebElement signIN = driver.findElement((By.xpath("//a[@id='login-in-with-password']")));
		 signIN.click();
		 Thread.sleep(1000);
		 WebElement myAccount = driver.findElement((By.className("userprofile")));
		 myAccount.click();
		 Thread.sleep(1000);
		 WebElement myProfile = driver.findElement((By.xpath("//span[text()=' My profile ']")));
		 myProfile.click();
		 Set<String> allwindowIds = driver.getWindowHandles();
		List<String>a1 = new ArrayList<>(allwindowIds);
		String parentWindowID = a1.get(0);
		String childWindowID  =  a1.get(1);

       driver.switchTo().window(childWindowID);
       Thread.sleep(1000);
    String actualUN = driver.findElement((By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']"))).getText();
    System.out.println(actualUN);
    String expectdUN = "Rajashri Kadam";
   if(actualUN.equals(expectdUN))
   {
	   System.out.println("UN is matched, TC is passed");
   }
   else
   {
	   System.out.println("UN is not matched, TC is failed"); 
   }

	}

}

