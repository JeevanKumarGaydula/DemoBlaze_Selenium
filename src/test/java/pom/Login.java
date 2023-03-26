package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
private WebDriver driver;
	
	@CacheLookup
	@FindBy(id = "signin2")
	WebElement signup;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id = \"sign-username\"]")
	WebElement signup_u_name;
	
	@CacheLookup
	@FindBy(xpath = "//input[@id = \"sign-password\"]")
	WebElement signup_pwd;

	@CacheLookup
	@FindBy(xpath = "//button[@onclick=\"register()\"]")
	WebElement signup_btn;
	
	@CacheLookup
	@FindBy(id = "login2")
	WebElement login;
	
	@CacheLookup
	@FindBy(id = "loginusername")
	WebElement login_u_name;

	@CacheLookup
	@FindBy(id = "loginpassword")
	WebElement login_pwd;
	
	@CacheLookup
	@FindBy(xpath = "//button[@onclick=\"logIn()\"]")
	WebElement login_btn;
	
	public  Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signUp(String username, String password) throws InterruptedException {
		
		signup.click();
		
		signup_u_name.clear();
		signup_u_name.sendKeys(username);
		
		signup_pwd.clear();
		signup_pwd.sendKeys(password);
		
		signup_btn.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void logIn(String username, String password) throws InterruptedException {
		
		login.click();
		
		login_u_name.clear();
		login_u_name.sendKeys(username);
		
		login_pwd.clear();
		login_pwd.sendKeys(password);
		
		login_btn.click();
		
	}
	
}
