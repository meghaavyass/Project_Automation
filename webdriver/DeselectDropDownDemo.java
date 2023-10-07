package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropDownDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver og=new ChromeDriver();
		og.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		og.manage().window().maximize();
		Thread.sleep(2000);
		Select s=new Select(og.findElement(By.id("fruits")));
		Thread.sleep(2000);
		s.selectByVisibleText("Orange");
		Thread.sleep(2000);
		s.selectByValue("apple");
		Thread.sleep(2000);
		s.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		og.close();
		
	}

}
