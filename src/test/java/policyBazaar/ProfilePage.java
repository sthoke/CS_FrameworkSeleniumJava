package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	// declaration of variables
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement userName;
	@FindBy(className="h_l") private WebElement logOut;
	
	// initialization of variables
	public ProfilePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void validateActualUserName()
	{
		String actualUN = userName.getText();
		String expectedUN = "Rajashri Kadam";
		   if(actualUN.equals(expectedUN))
		   {
			   System.out.println("Actual and Expected UN is matched, TC is passed");
		   }
		   else
		   {
			   System.out.println("Actual and Expected UN is not matched, TC is failed"); 
		   }

	}
	
	public void clickOnLogOutButton()
	{
		logOut.click();
	}

}
