package seleniumSecanrios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//          WebElement productTypesDropDown = driver.findElement(By.xpath("//div[@class='drp1']//a"));
//          productTypesDropDown.click();
//          WebElement accountOption = driver.findElement(By.xpath("//li[text()='Accounts']"));
//          accountOption.click();
          WebElement selectProductDropDown = driver.findElement(By.xpath("//div[@class='drp2']//ul"));
          selectProductDropDown.click();
          WebElement savingAccount= driver.findElement(By.xpath("//li[text()='Savings Accounts']"));
          savingAccount.click();
   
	}

}
