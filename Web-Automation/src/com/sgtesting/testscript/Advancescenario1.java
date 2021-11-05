package com.sgtesting.testscript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancescenario1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		loginuser1();
		logoutuser1();
		loginuser2();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginadmin();
		Modifypasswordsforuser123();
		logouta();
		loginuser11();
		logoutuser11();
		loginuser22();
		logoutuser22();
		loginuser33();
		logoutuser33();
		loginadmin1();
		deleteUser();
		logouta1();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("n");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("chandana@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("chandana");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("n");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("chandana@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("chandana1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("n");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("chandana@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("chandana2");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana");
			oBrowser.findElement(By.name("pwd")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana1");
			oBrowser.findElement(By.name("pwd")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana2");
			oBrowser.findElement(By.name("pwd")).sendKeys("chan123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginadmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void Modifypasswordsforuser123() 
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan512");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan512");
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(4000);
		//Modifypasswordforuser2
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan5124");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan5124");
		Thread.sleep(5000);
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(4000);
		//Modifypasswordforuser3
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("chan5123");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("chan5123");
		Thread.sleep(5000);
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void logouta()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser11()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana");
			oBrowser.findElement(By.name("pwd")).sendKeys("chan512");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser11()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void loginuser22()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana1");
			oBrowser.findElement(By.name("pwd")).sendKeys("chan5124");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser22()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser33()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("chandana2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("chan5123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
	
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logoutuser33()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginadmin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert pAlert=oBrowser.switchTo().alert();
			String str1=pAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert iAlert=oBrowser.switchTo().alert();
			String str2=iAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logouta1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
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


