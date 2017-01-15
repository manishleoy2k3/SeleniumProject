package com.naukri.LoginPage;

import org.junit.AfterClass;
import org.testng.annotations.Test;

import com.naukri.Userlibrary.DataProviderExample;
import com.naukri.Userlibrary.Userlibraries;

public class Login extends Userlibraries{
	
	//@Test(dataProvider="SearchProvider", dataProviderClass = DataProviderExample.class)
	@Test
	public void loginfacebook(){
		OpenChromeBrowser();
		//click(facebookEmailField);
		input(facebookEmailField, "manishleoy2k3@gmail.com");
		input(facebookPwdField, "leaseforcee1");
		click(LoginButton);
		waitforelement();
		//pressEscape();
		//pressEscape();
		enterKeys(searchField, "way2shayari.com");
		clickListElement(way2ShayariFirstLink, 1);
		click(way2ShayariPage);
		click(inviteFriendLink);
	}
	
	/*@Test(dataProvider="DP1", dataProviderClass = DataProviderExample.class)
	public void loginSnapdeal(String username, String password){
		OpenChromeBrowser();
		click(facebookEmailField);
		input(loginField, username);
		input(facebookPwdField, password);
		click(LoginButton);
	}*/
	
	@AfterClass
	public void tearDown(){
		closeBrowser();
	}
}
