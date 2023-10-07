package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver r=new ChromeDriver();
		r.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		r.manage().window().maximize();
		Thread.sleep(2000);
		
		Select s=new Select(r.findElement(By.id("fruits")));
		Thread.sleep(2000);
		s.selectByVisibleText("Orange");
		Thread.sleep(2000);
		s.selectByValue("banana");
		Thread.sleep(2000);
		s.deselectByValue("banana");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		r.close();
	}

}
