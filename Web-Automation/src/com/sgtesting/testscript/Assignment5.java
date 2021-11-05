package com.sgtesting.testscript;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		//closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void createCustomer()
	{
		try
		{
			oPage.getCustomer().click();
			Thread.sleep(2000);
			oPage.getaddcustomer().click();
			Thread.sleep(2000);
			oPage.getnewcustomer().click();
			Thread.sleep(2000);
			oPage.getcustomername().sendKeys("Democustomer1");
			Thread.sleep(2000);
			oPage.getcreatecustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createProject()
	{
		try
		{
			oPage.getaddcustomer().click();
			Thread.sleep(2000);
			oPage.getnewproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("Project1");
			Thread.sleep(2000);
			oPage.getsubmitproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteProject()
	{
		try
		{
			oPage.getdeleteclick().click();
			Thread.sleep(2000);
			oPage.getactionbutton().click();
			Thread.sleep(2000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			oPage.getpannel().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oPage.getdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getdeleteaction().click();
			Thread.sleep(2000);
			oPage.getdeleteoption().click();
			Thread.sleep(1000);
			oPage.getdeletepermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
	
	
