//package seleniumSecanrios;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.j2objc.annotations.ReflectionSupport.Level;
//
//public class HandleWebTable {
//
//	
//	public static void main(String[] args) {
//
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://money.rediff.com/indices");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
//	
//	
//	
//	WebElement showMore = driver.findElement(By.xpath("//a[text()='Show More >>']"));
//	showMore.click();
//	WebElement webTable = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
//	List<WebElement> rows = webTable.findElements(By.tagName("tr"));
//	int rowsCount = rows.size();
//	for(int i=0;i<rowsCount;i++)
//	{
//		List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
//		int columnsCount = columns.size();
//		for(int j=0;j<columnsCount;j++)
//		{
//			String cellText = columns.get(j).getText();
//			if(cellText.equals("S&P BSE 500"))
//			{
//				System.out.println( "Prev Close values : "+ columns.get(1).getText());
//			}
//		}
//		
//	}
//	driver.quit();
//	}
//
//}
package seleniumSecanrios;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");
        driver.manage().window().maximize();
        
        // Use a reasonable implicit wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement showMore = driver.findElement(By.xpath("//a[text()='Show More >>']"));
        showMore.click();
        WebElement webTable = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
        List<WebElement> rows = webTable.findElements(By.tagName("tr"));
        int rowsCount = rows.size();
        
        for (int i = 0; i < rowsCount; i++) {
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            int columnsCount = columns.size();
            
            for (int j = 0; j < columnsCount; j++) {
                String cellText = columns.get(j).getText();
                if (cellText.equals("S&P BSE 500")) {
                    System.out.println("Prev Close values : " + columns.get(1).getText());
                }
            }
        }
        
        // Close the driver at the end
        driver.quit();
    }
}






