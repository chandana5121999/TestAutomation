package com.sgtesting.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		//minimizeFlyOutWindow();
		createUser1();
		logout();
		loginuser1();
		createUser2();
		logoutuser1();
		loginuser2();
		createUser3();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginuser21();
		modifyuser3();
	    logoutuser21();
	    loginuser31();
	    logoutuser31();
	    loginuser11();
	    modifyuser2();
	    logoutuser11();
	    loginuser22();
	    logoutuser22();
		loginadmin();
		modifyuser1();
		logoutadmin();
		loginuser12();
		logoutuser12();
		loginuser221();
		deleteuser3();
		logoutuser221();
		loginuser121();
		deleteUser2();
		logoutuser121();
		loginadmin1();
		deletUser1();
		logoutadmin1();
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
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createUser1()
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
			oPage.getusername().sendKeys("chandana");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("chan123");
			Thread.sleep(1000);
			oPage.getretype().sendKeys("chan123");
			oPage.getcreate().click();
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
	
	static void loginuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana");
			oPage.getPassword().sendKeys("chan123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			oPage.getuser1().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createUser2()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("User2");
			Thread.sleep(1000);
			oPage.getlastname().sendKeys("n");
			Thread.sleep(1000);
			oPage.getemailid().sendKeys("chandana@gmail.com");
			Thread.sleep(1000);
			oPage.getusername().sendKeys("chandana2");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("chan1234");
			Thread.sleep(1000);
			oPage.getretype().sendKeys("chan1234");
			oPage.getcreate().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser1()
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
	
	static void loginuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana2");
			oPage.getPassword().sendKeys("chan1234");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
			oPage.getuser2().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createUser3()
	{
		try
		{	
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("User3");
			Thread.sleep(1000);
			oPage.getlastname().sendKeys("n");
			Thread.sleep(1000);
			oPage.getemailid().sendKeys("chandana@gmail.com");
			Thread.sleep(1000);
			oPage.getusername().sendKeys("chandana3");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("chan12345");
			Thread.sleep(1000);
			oPage.getretype().sendKeys("chan12345");
			oPage.getcreate().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutuser2()
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
	
	static void loginuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana3");
			oPage.getPassword().sendKeys("chan12345");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getuser3().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser3()
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
	
	static void loginuser21()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana2");
			oPage.getPassword().sendKeys("chan1234");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void  modifyuser3()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getdeleteuser3().click();
			Thread.sleep(1000);
			oPage.getpassword3().sendKeys("chandu1234");
			Thread.sleep(2000);
			oPage.getcopy().sendKeys("chandu1234");
			Thread.sleep(2000);
			oPage.getcreate().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser21()
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
	
	static void loginuser31()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana3");
			oPage.getPassword().sendKeys("chandu1234");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser31()
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
	
	static void loginuser11()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana");
			oPage.getPassword().sendKeys("chan123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void  modifyuser2()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage. getdeleteuser2().click();
			Thread.sleep(1000);
			oPage.getpassword3().sendKeys("chandu12345");
			Thread.sleep(2000);
			oPage.getcopy().sendKeys("chandu12345");
			Thread.sleep(2000);
			oPage.getcreate().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void logoutuser11()
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
	
	static void loginuser22()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana2");
			oPage.getPassword().sendKeys("chandu12345");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser22()
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
	
	static void loginadmin()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void  modifyuser1()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getdeleteuser1().click();
			Thread.sleep(1000);
			oPage.getpassword3().sendKeys("chandu123");
			Thread.sleep(2000);
			oPage.getcopy().sendKeys("chandu123");
			Thread.sleep(2000);
			oPage.getcreate().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutadmin()
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
	
	static void loginuser12()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana");
			oPage.getPassword().sendKeys("chandu123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	

	static void logoutuser12()
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
	
	
	static void loginuser221()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana2");
			oPage.getPassword().sendKeys("chandu12345");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteuser3()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getdeleteuser3().click();
			Thread.sleep(1000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			Alert iAlert=oBrowser.switchTo().alert();
			String str2=iAlert.getText();
			System.out.println(str2);
			iAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser221()
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
	
	static void loginuser121()
	{
		try
		{
			oPage.getUserName().sendKeys("chandana");
			oPage.getPassword().sendKeys("chandu123");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void deleteUser2()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getdeleteuser2().click();
			Thread.sleep(1000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			Alert pAlert=oBrowser.switchTo().alert();
			String str3=pAlert.getText();
			System.out.println(str3);
			pAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser121()
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
	
	static void loginadmin1()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletUser1()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage. getdeleteuser1().click();
			Thread.sleep(1000);
			oPage.getdelete().click();
			Thread.sleep(2000);
			Alert pAlert=oBrowser.switchTo().alert();
			String str1=pAlert.getText();
			System.out.println(str1);
			pAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutadmin1()
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

