package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_Performance {
	
	
	
	private static WebDriver driver;
	@FindBy(xpath = "//a[@id='menu__Performance']")
	private WebElement performance;
	@FindBy(xpath = "//a[@id='menu_performance_ManageReviews']")
	private WebElement manage;
	@FindBy(xpath = "//a[@id='menu_performance_searchPerformancReview']")
	private WebElement searchmanagereviews;
	

	@FindBy(xpath = "//input[@id='toDate']")
	private WebElement todate;
	@FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")
	private WebElement month;
	@FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")
	private WebElement year;
	@FindBy(xpath = "//body/div[@id='ui-datepicker-div']/table[1]")
	private WebElement date;
	
	public Employee_Performance(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPerformance() {
		return performance;
	}
	
	public WebElement getSearchmanagereviews() {
		return searchmanagereviews;
	}

	public WebElement getManage() {
		return manage;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDate() {
		return date;
	}
	
	
	
	
	
	
	
	
}
