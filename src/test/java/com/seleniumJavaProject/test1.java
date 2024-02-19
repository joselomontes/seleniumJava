package com.seleniumJavaProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;



//Para JNUNIT
//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Para TESTNG
import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test1 {
	
	WebDriver driver;
	WebElement el;
	
	
	//@Before PARA JUNIT
	@BeforeTest
	
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
	
		
		//driver = new ChromeDriver(options);
		
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void validateTitlePage() throws InterruptedException {
		
		
		driver.get("https://www.google.com/maps");
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title, "Google Maps");
		Assert.assertEquals(title, "Google Maps");
		el = driver.findElement(By.cssSelector("#searchboxinput"));
		el.sendKeys("prueba");
	}
	
	@AfterTest
	
	public void endTest() {
		driver.close();
		
		
	}
	

}
