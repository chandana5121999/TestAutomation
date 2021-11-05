package com.sgtesting.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deletUser();
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

	
	static void createUser()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getlastname().sendKeys("n");
			Thread.sleep(1000);
			oPage.getemailid().sendKeys("chandana@gmail.com");
			Thread.sleep(1000);
			oPage.getusername().sendKeys("chand");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("chandana123");
			Thread.sleep(1000);
			oPage.getretype().sendKeys("chandana123");
			oPage.getcreate().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oPage.getClick().click();
			Thread.sleep(2000);
			oPage.getname().clear();
			Thread.sleep(2000);
			oPage.getname().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getsave().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletUser()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(1000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}






