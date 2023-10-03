package AnnotationsStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement hover = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		WebElement signin = driver.findElement(By.xpath("//a[@class='nav-action-signin-button']"));
		signin.click();
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("radhej0143@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		 pass.sendKeys("radheshyam@123");
		 driver.findElement(By.id("signInSubmit")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 search.sendKeys("OnePlus 11 5G (Eternal Green, 16GB RAM, 256GB Storage)");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();	 
	//	 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@alt='OnePlus 11 5G (Eternal Green, 16GB RAM, 256GB Storage)']")).click();
		 
		 Set<String> windowIDS = driver.getWindowHandles();
		 Iterator<String> iDS = windowIDS.iterator();
		 String parentWindow = iDS.next();
		 String childWindow = iDS.next();
		 System.out.println(parentWindow);
		 System.out.println(childWindow);
		 Thread.sleep(2000);
		 driver.switchTo().window(childWindow);
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();	
		 driver.findElement(By.xpath("//a[@id='nav-cart']")).click();

	}
}
