package com.appdirect.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appdirect.Utils.ReadFile;

public class EmailPage {
	WebDriver driver;
	String inputxpath;
	String buttonxpath, email;
	
	public EmailPage(WebDriver driver) {
		this.driver = driver;
	}

	public void EmailPageFuntionalities() throws IOException {
		ReadFile read = new ReadFile();
		Properties pr = read.propertyFile("EmailPage.properties");
		inputxpath = pr.getProperty("inputxpath");
		buttonxpath= pr.getProperty("buttonxpath");
		email = pr.getProperty("email");
		Email();
	}
	
	public void Email() {
		driver.findElement(By.xpath(inputxpath)).sendKeys(email);
		driver.findElement(By.xpath(buttonxpath)).click();
	}
}
