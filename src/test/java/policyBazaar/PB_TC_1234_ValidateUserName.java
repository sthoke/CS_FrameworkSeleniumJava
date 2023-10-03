package policyBazaar;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PB_TC_1234_ValidateUserName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
        driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// create objects of pom classes
		
		HomePage home =new HomePage(driver);
		
		Thread.sleep(1000); 
		home.clickOnHomePageSignINButton();
		home.enterMobileNU();
		Thread.sleep(1000);
		home.clickOnSignInWithPasswordButton();
		Thread.sleep(1000); 
        home.enterPassword();
		Thread.sleep(1000); 
        home.clickOnSignINButton();
		Thread.sleep(1000); 
		home.clickOnMyAccount();
		Thread.sleep(1000);
		home.clickOnMyProfile();
		Thread.sleep(1000);
		
		//handle new page window
		 Set<String> allwindowIds = driver.getWindowHandles();
			List<String>a1 = new ArrayList<>(allwindowIds);
			String childWindowID  =  a1.get(1);
	       driver.switchTo().window(childWindowID);
	       Thread.sleep(1000);
	       
	      ProfilePage profile = new ProfilePage(driver);
	       profile.validateActualUserName();
	       Thread.sleep(1000);
	       profile.clickOnLogOutButton();
	       Thread.sleep(1000);
	       driver.quit();
	       Thread.sleep(1000);

	}

}
