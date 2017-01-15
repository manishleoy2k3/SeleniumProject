package com.naukri.Userlibrary;

import org.openqa.selenium.By;

public interface IORepositories {
	
	public By facebookEmailField = By.xpath("//*[@id='email']");
	//public By loginField = By.xpath("//input[@class='_2zrpKA']");
	public By facebookPwdField = By.xpath("//*[@id='pass']");
	public By LoginButton = By.xpath("//*[@id='u_0_m']");
	public By searchField = By.xpath("(//*[@id='u_1_2']/input)[2]");
	public By way2ShayariFirstLink = By.xpath("//ul[@id='facebar_typeahead_view_list']/li");
	public By way2ShayariPage = By.xpath("//a[contains(.,'way2shayari.com')]/ancestor::div/span/descendant[starts-with(@class='highlightNode')]");
	public By inviteFriendLink = By.xpath("//*[@id='u_jsonp_3_x']");

}
