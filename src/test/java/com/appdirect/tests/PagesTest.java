package com.appdirect.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.appdirect.BrowserSelect.BrowserChoice;
import com.appdirect.BrowserSelect.BrowserDriver;
import com.appdirect.Pages.EmailPage;
import com.appdirect.Pages.HomePage;
import com.appdirect.Pages.SignUpPage;

public class PagesTest{
	
	WebDriver driver;
	String browser;
	
//	@BeforeClass
//	public void StartBrowser() {
//		
////		browser contains name of browser chosen by the user
//		BrowserChoice choice = new BrowserChoice();
//		browser = choice.BrowserSelection();
//		
////		driver contains the driver of browser chosen by the user
//		BrowserDriver browserDriver = new BrowserDriver();
//		driver = browserDriver.driver(browser);
//		
//		driver.manage().window().maximize();
//	}
	
	@Test
	public void HomePageTest() throws IOException {
//	browser contains name of browser chosen by the user
	BrowserChoice choice = new BrowserChoice();
	browser = choice.BrowserSelection();
	
//	driver contains the driver of browser chosen by the user
	BrowserDriver browserDriver = new BrowserDriver();
	driver = browserDriver.driver(browser);
		
		HomePage homePage = new HomePage(driver);
		homePage.HomePageFuntionalities();
		
	}
	
	@Test(dependsOnMethods = {"HomePageTest"})
	public void SignUpPageTest() throws IOException {
		
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.SignUpPageFuntionalities();
	}
	
	@Test(dependsOnMethods = {"SignUpPageTest"})
	public void EmailPage() throws IOException {
		
		EmailPage emailPage = new EmailPage(driver);
		emailPage.EmailPageFuntionalities();
	}
	
	
}
