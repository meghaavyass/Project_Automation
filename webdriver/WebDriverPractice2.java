package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://careercenter.tops-int.com/");
		Thread.sleep(2000);
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.findElement(By.name("user_name")).sendKeys("9157238002");
		Thread.sleep(2000);
		c.findElement(By.name("user_password")).sendKeys("9157238002");
		Thread.sleep(2000);
		c.close();
	}

}
