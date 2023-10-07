package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_TextDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver cdr=new ChromeDriver();
		
		cdr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		cdr.manage().window().maximize();
		Thread.sleep(2000);
		cdr.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		cdr.close();
	}

}
