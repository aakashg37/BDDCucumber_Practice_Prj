package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver driver;
	
	//POM
	//1)Instance variables/ Data members should be declared
	//globally with access level private by using @Findby Annotation
	
	@FindBy(xpath="//img[@alt='company-branding']") private WebElement Logo;
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement Username;
	@FindBy(xpath="//input[@name='password']") private WebElement Password;
	@FindBy(xpath="//button[text()=' Login ']") private WebElement LoginBtn;
	@FindBy(xpath="//h6[text()='Dashboard']") private WebElement Dashboard;
	
	
	//2) Initialize within a constructor with access level public using PageFactory Class
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyAppLogo() {
		boolean logoElement = Logo.isDisplayed();
		return logoElement;
	}
	
	public void enterUsername(String username) {
		Username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LoginBtn.click();
	}
	
	public String navigatedToDashboardPage() {
		String page=Dashboard.getText();
		return page;
	}
	
}






