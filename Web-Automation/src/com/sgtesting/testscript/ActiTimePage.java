package com.sgtesting.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElements
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	
	//create Customer
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement ocustomer;
	public WebElement getCustomer()
	{
		return ocustomer;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement oadd;
	public WebElement getaddcustomer()
	{
		return oadd;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement oNew;
	public WebElement getnewcustomer()
	{
		return oNew;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getcustomername()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement icreate;
	public WebElement getcreatecustomer()
	{
		return icreate;
	}
	
	
	
	//New project
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement oproject;
	public WebElement getnewproject()
	{
		return oproject;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div")
	private WebElement isubmitpro;
	public WebElement getsubmitproject()
	{
		return isubmitpro;
	}
	
	
	
	//create task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement otask;
	public WebElement getcreatetask()
	{
		return otask;
	}
	
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement onewtask;
	public WebElement getnewtask()
	{
		return onewtask;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement oenter;
	public WebElement getentertask()
	{
			return oenter;
	}
		
		@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
		private WebElement obutton;
		public WebElement getcreatetaskbutton()
		{
			return obutton;
		}
		
	//delete task
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
		private WebElement odeleteta;
		public WebElement getdeletetask()
		{
			return odeleteta;
		}
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")
		private WebElement oactionta;
		public WebElement getactiontask()
		{ 
			return oactionta;
		}
	
		private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
		public WebElement getdeletetaskpannel()
		{
			return  deleteTaskPopup_deleteConfirm_submitTitle;
		}
	
	//modify project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement omodifypro;
	public WebElement getmodifyproject()
	{
		return omodifypro;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement pclose;
	public WebElement getcloseproject()
	{
		return pclose;
	}
	
	
	//delete project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement pdelete;
	public WebElement getdeleteclick()
	{
		return pdelete;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement gdelete;
	public WebElement getactionbutton()
	{
		return gdelete;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement kdelete;
	public WebElement getdeletebutton()
	{
		return kdelete;   
	}
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getpannel()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	
	
	//modify customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement omodify;
	public WebElement getmodify()
	{
		return omodify;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement imodify;
	public WebElement gettextarea()
	{
		return imodify;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement oclear;
	public WebElement getclose()
	{
		return oclear;
	}
	
	
	//delete customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement odelete;
	public WebElement getdeletecustomer()
	{
		return odelete;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement ioption;
	public WebElement getdeleteaction()
	{
		return  ioption;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement ooption;
	public WebElement getdeleteoption()
	{
		return ooption;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	
	//Users Image
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUser;
	public WebElement getUserTab()
	{
		return oUser;
	}
	
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdd;
	public WebElement getAddUser()
	{
		return oAdd;
	}
	
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	
	private WebElement userDataLightBox_emailField;
	public WebElement getemailid()
	{
		return userDataLightBox_emailField;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return  userDataLightBox_passwordField;
	}
	
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getretype()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement oSubmit;
	public WebElement getcreate()
	{
		return oSubmit;
	}
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement iClick;
	public WebElement getUser()
	{
		return iClick;
	}
	
	//User1
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement owelcome;
	public WebElement getuser1()
	{
		return owelcome;
	}
	
	//User2
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement owelcome2;
	public WebElement getuser2()
	{
		return owelcome2;
	}
	
	//User3
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
		private WebElement owelcome3;
		public WebElement getuser3()
		{
			return owelcome3;
		}
	
	//modify User
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement oclick;
	public WebElement getClick()
	{
		return oclick;  
	}
	
	private WebElement password;
	public WebElement getpassword3()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getcopy()
	{
		return passwordCopy;
	}
	
	private WebElement userDataLightBox_firstNameField1;
	public WebElement getname()
	{
		return  userDataLightBox_firstNameField;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement iSave;
	public WebElement getsave()
	{
		return iSave;
	}
	
	
	
	//delete user
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdelete()
		{
			return userDataLightBox_deleteBtn;
		}
		
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
		private WebElement idelete1;
		public WebElement getdeleteuser1()
		{
			return idelete1;
		}	
		
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement idelete2;
		public WebElement getdeleteuser2()
		{
			return idelete2;
		}
		
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement odelete3;
		public WebElement getdeleteuser3()
		{
			return odelete3;
		}
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}


