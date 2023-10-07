package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver og=new ChromeDriver();
		og.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		og.manage().window().maximize();
		Thread.sleep(2000);
		Select s=new Select(og.findElement(By.name("country")));
		Thread.sleep(2000);
		s.selectByVisibleText("BAHAMAS");
		Thread.sleep(2000);
		s.selectByValue("BANGLADESH");
		Thread.sleep(2000);
		og.close();
		
	}

}
