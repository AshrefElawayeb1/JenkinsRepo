package com.procrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.procrm.LoginPage;

import com.procrm.HomePage;

public class LoginPageTest {
	
	WebDriver driver = null;
	LoginPage loginPage = null;
	HomePage homePage = null;

	@BeforeTest
	public void setUp() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
		
		options.setBinary("C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\jar\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/index.html");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		homePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);

	}
	
	
	
	/*@AfterTest
	public void tearDown() {
		driver.close();
	}*/
	
	@Test(priority=1)
	public void loginHappyPathVerification() {
		loginPage.doLogin("madhoo", "12341234Aa");
	}
	
	@Test(priority=2)
	public void homePageClick() {
		homePage.goHomePage();
	}

}
