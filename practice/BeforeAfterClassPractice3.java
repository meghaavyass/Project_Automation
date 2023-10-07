package com.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterClassPractice3 {
	
	static ChromeDriver cd=null;
	
	@BeforeClass
	public static void beforestarttest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		cd=new ChromeDriver();
		cd.get("https://practice.automationtesting.in/");
		Thread.sleep(2000);
		cd.manage().window().maximize();
	}
	@Before
	public void beforetest()
	{
		System.out.println(cd.getCurrentUrl());
	}
	@Test
	public void test() throws InterruptedException
	{
		cd.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[2]")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[3]")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a")).click();
		Thread.sleep(2000);
	}
	@After
	public void aftertest()
	{
		System.out.println(cd.getCurrentUrl());
	}
	@AfterClass
	public static void afterendtest()
	{
		cd.close();
	}

}
