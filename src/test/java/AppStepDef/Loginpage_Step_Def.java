package AppStepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POM_Classes.LoginPage;
import QA.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage_Step_Def 
{
	LoginPage lp=new LoginPage(DriverFactory.getDriver());

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		WebDriver driver=DriverFactory.getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Entered URl and Reached Login Page");
	}

	@Then("the application logo should be displayed")
	public void the_application_logo_should_be_displayed() {
	   boolean isLogoDisplayed=lp.verifyAppLogo();
	   Assert.assertEquals(isLogoDisplayed, true);
	   System.out.println("App Logo is displayed");
	}

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String UserName) {
	    lp.enterUsername(UserName);
	    System.out.println("UserName entered");
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String Password) {
	    lp.enterPassword(Password);
	    System.out.println("Password entered");
	}

	@When("User clicks on login Button")
	public void user_clicks_on_login_button() {
	   lp.clickOnLoginButton();
	   System.out.println("Clicked on Login Button");
	}

	@Then("User Should be navigated to {string} Page")
	public void user_should_be_navigated_to_page(String ExpectedResult) {
	   String ActualResult = lp.navigatedToDashboardPage();
	   Assert.assertEquals(ActualResult, ExpectedResult);
	   System.out.println("Navigated To Dashboard Page");
	}
	
}
