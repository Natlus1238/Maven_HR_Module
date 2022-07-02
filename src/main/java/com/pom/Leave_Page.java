package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_Page {
	public static WebDriver driver;
	
	public Leave_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	private WebElement leave;
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	private WebElement myleave;
	@FindBy(xpath = "//a[@id='menu_leave_Entitlements']")
	private WebElement entitlement;
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveEntitlements']")
	private WebElement vle;
	@FindBy(id = "entitlements_employee_empName")
	private WebElement nameofemployee;
	@FindBy(xpath = "//select[@id='entitlements_leave_type']")
	private WebElement selectleavetype;
	@FindBy(xpath = "//select[@id='period']")
	private WebElement leaveperiod;
	
	
	public WebElement getSelectleavetype() {
		return selectleavetype;
	}
	public WebElement getVle() {
		return vle;
	}
	public WebElement getEntitlement() {
		return entitlement;
	}
	public WebElement getLeave() {
		return leave;
	}
	public WebElement getMyleave() {
		return myleave;
	}
	public WebElement getNameofemployee() {
		return nameofemployee;
	}
	public WebElement getLeaveperiod() {
		return leaveperiod;
	}
	
	
	
	
	
	
	
	
	
	
	
}
