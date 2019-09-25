package com.procrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	protected WebDriver driver;
	
	@FindBy(css = "input[placeholder='Username'")
	WebElement userNameElm;
	
	@FindBy(css = "input[placeholder='Password'")
	WebElement passwordElm;
	
	@FindBy(css = "input.btn.btn-small")
	WebElement loginButton;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doLogin(String id, String pass) {
		userNameElm.sendKeys(id);
		passwordElm.sendKeys(pass);
		loginButton.click();
	}


}
