package com.edureka.DemoBlaze;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pom.Login;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {

	WebDriver driver;
	
	@Before
	public void setUpBrowser() {	
		driver = new FirefoxDriver();

	}
		
	@Given("I am on the signUp page")
	public void navToSignUp() {		
		driver.get("https://www.demoblaze.com/");	
	}
	
	@When("I enter username as {string} and password as {string} on signup page")
	public void signUp(String username, String password) throws InterruptedException {
		Login login = new Login(driver);
		login.signUp(username, password);
	}
	
	@Then("I should successfully signUp")
	public void signUp_success() {
		System.out.println("User Registered successfully");
	}
	
	@And("User accepts alert message")
	public void alert_msg() {
		System.out.println("User accepted alert message");
	}
	
	@When("I enter username as {string} and password as {string} on login page")
	public void logIn(String username, String password) throws InterruptedException {
		Login login = new Login(driver);
		login.logIn(username, password);
	}
	
	@Then("I should successfully logIn")
	public void login_success() {
		System.out.println("Login successfull");
	}

}
