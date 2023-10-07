package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.instagram.com/");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		cd.findElement(By.name("username")).sendKeys("shreyansh_agola");
		Thread.sleep(2000);
		cd.findElement(By.name("password")).sendKeys("xrjxnrhcr");
		Thread.sleep(2000);
		
		cd.close();
				
	}

}
