package Baseclass;

import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public FirefoxDriver driver;
	
	
	
	
	
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");	
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	/*
	@AfterSuite
	public void reportGeneration() throws Exception{	
		Xl.generateReport("reportname1234.xlsx");
	
	} **/
}
