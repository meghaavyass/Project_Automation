package com.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterClassPractice1 {
	
	static ChromeDriver driver=null;
	@BeforeClass
	public static void start() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	@Before
	public void beforetest()
	{
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(3000);
	}
	@After
	public void aftertest()
	{
		System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	public static void close()
	{
		driver.close();
	}

}
