package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Variable declaration
	@FindBy(className="sign-in") private WebElement homePageSignINButton;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobileNU;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement signInWithPassword;
	@FindBy(name="password") private WebElement passwordField;
	@FindBy(xpath="//a[@id='login-in-with-password']") private WebElement signINButton;
	@FindBy(className="userprofile") private WebElement myAccount;
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	
	//initialization of global variable by using constructor
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Methods for every global variable
	
	public void clickOnHomePageSignINButton()
	{
		homePageSignINButton.click();	
	}
	public void enterMobileNU()
	{
		mobileNU.sendKeys("9623153925");
	}
	public void clickOnSignInWithPasswordButton()
	{
		signInWithPassword.click();	
	}
	public void enterPassword()
	{
		passwordField.sendKeys("raju@2811");
	}
	public void clickOnSignINButton()
	{
		signINButton.click();
	}
	public void clickOnMyAccount()
	{
		myAccount.click();
	}
	public void clickOnMyProfile()
	{
		myProfile.click();
	}


}
