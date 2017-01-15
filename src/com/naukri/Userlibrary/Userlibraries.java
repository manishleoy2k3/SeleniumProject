package com.naukri.Userlibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;

import com.naukri.ReportClass.ListenerClass;

public class Userlibraries extends ListenerClass implements IORepositories{
	protected Utilities utils = new Utilities();
	
	public WebDriver driver = null;
	
	public void openFirefoxBrowser(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("www.facebook.com");
	}
	public void OpenChromeBrowser(){
		Map<String, Object> prefs = new HashMap<String, Object>();
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

        // Set the experimental option
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver(options);
		//waitforelement();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void pressEscape(){
		
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ESCAPE);
			rb.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitforelement(){
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		
	}
	public void clickListElement(By element, int index){
		List<WebElement> list = driver.findElements(element);
		list.get(index).click();
	}
	public String input(By strrr,String test){
		try {
			driver.findElement(strrr).clear();
			driver.findElement(strrr).sendKeys(test);
			
		} catch (Exception e) {
           e.printStackTrace();
		}
		return test;
	}
	public void enterKeys(By str, String keys){
		driver.findElement(str).sendKeys(keys);
	}
	public void click(By str){
		driver.findElement(str).click();
	}
	
	public void closeBrowser(){
		driver.quit();
	}
}
