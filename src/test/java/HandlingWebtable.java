import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
		
		WebElement Row = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr"));
		WebElement Column = driver.findElement(By.xpath("//table[@summary='Sample Table']//td"));
		
		WebElement Coumtry = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr[1]//td[1]"));
		
		WebElement City = driver.findElement(By.xpath("//table[@summary='Sample Table']//tr[1]//td[2]"));
		
		
	}

}
