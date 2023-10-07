package com.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserID {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation FIles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		Thread.sleep(1000);
		driver.findElement(By.name("uid")).sendKeys("mngr530090");
		driver.findElement(By.name("password")).sendKeys("ynurudU");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
