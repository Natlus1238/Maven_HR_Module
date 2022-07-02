package com.testwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.pom.Employee_Performance;
import com.pom.Leave_Page;
import com.pom.Sign_In;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = Base_Class.gettingBrowser("Chrome");
	public static Sign_In login = new Sign_In(driver);
	public static Leave_Page leave = new Leave_Page(driver);
	public static Employee_Performance ep = new Employee_Performance(driver);
	

	public static void main(String[] args) throws InterruptedException {
		
		gettingurl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(3000);
		sendText(login.getUsrname(), "Admin");
		Thread.sleep(2000);
		sendText(login.getPass(), "admin123");
		clickOnElement(login.getSignin_btn());
		action_functions(leave.getLeave(), "mouse over");
		action_functions(leave.getEntitlement(), "mouse over");
		clickOnElement(leave.getVle());
		sendText(leave.getNameofemployee(), "Sultan");
		Thread.sleep(3000);
		select_dropdown(leave.getSelectleavetype(), "By visible text", "CAN - Personal");
		select_dropdown(leave.getLeaveperiod(), "By Index", "2");
		action_functions(ep.getPerformance(), "mouse over");
		action_functions(ep.getManage(), "mouse over");
		clickOnElement(ep.getSearchmanagereviews());
		clickOnElement(ep.getTodate());
		select_dropdown(ep.getYear(), "By Visible Text", "1997");
		select_dropdown(ep.getMonth(), "By Index", "2");
		Thread.sleep(4000);
		
		
		
		
		
	}

}
