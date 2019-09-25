package com.procrm;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

		
	protected WebDriver driver;
		  
		@FindBy(css ="a[title=\"Deals\"]")
		
		WebElement home;			
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		
		
		public void goHomePage() {
			// switch to iframe and
			driver.switchTo().frame("mainpanel");
			home.click();
	
		}
}
