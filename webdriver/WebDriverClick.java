package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver m=new ChromeDriver();
		m.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		m.manage().window().maximize();
		Thread.sleep(2000);
		m.findElement(By.id("user-name")).sendKeys("standard_user");
		//inspect with id 
		Thread.sleep(2000);
		m.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		m.findElement(By.id("login-button")).click();
		//click karva mate .click()
		if(m.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Test Sucessfull");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		m.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		m.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		m.close();
	}

}
