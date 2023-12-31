package com.adactinbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}
	
	
	public Login(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	
	

}
