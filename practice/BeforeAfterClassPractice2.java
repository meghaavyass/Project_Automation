package com.practice;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterClassPractice2 {
	
	static ChromeDriver driver=null;
	
	@BeforeClass
	public static void beforestart() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://64.227.103.212:8080/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/nav/a[2]")).click();
		Thread.sleep(3000);
	}
	@Before
	public void beforetest()
	{
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("shreyanshagola2411@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div[1]/input")).sendKeys("Shrey@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary.btn-block")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/nav/div/div/button/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/nav/div/div/ul/li[6]/a")).click();
		Thread.sleep(5000);
	}
	@After
	public void aftertest()
	{
		System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	public static void afterfinish()
	{
		driver.close();
	}

}
