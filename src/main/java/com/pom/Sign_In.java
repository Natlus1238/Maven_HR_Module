package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement usrname;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement pass;
	
	@FindBy(id="btnLogin")
	private WebElement signin_btn;

	public Sign_In(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
