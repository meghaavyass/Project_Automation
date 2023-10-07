package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.name("text")).sendKeys("Shreyansh Agola");
		Thread.sleep(2000);
		d.close();
	}

}
