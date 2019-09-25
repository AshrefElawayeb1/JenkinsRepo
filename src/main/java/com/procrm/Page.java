package com.procrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		wait = new WebDriverWait(driver, 30);
	}
	
	public boolean verifyText(WebElement elm, String expectedText) {
		if(elm.getText().equalsIgnoreCase(expectedText))
			return true;
		return false;
	}
	
	public void waitForVisisbility(WebElement elm) {
		wait.until(ExpectedConditions.visibilityOf(elm));
	}

	
	public void waitTillElementIsVisible(String selector) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(selector)));
	}
	
	public void waitForVisisbilityXpath(String selector) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(selector)));
	}
	
	abstract public String getPageTitle();
}
