package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_ClickDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver m=new ChromeDriver();
		m.get("https://www.tops-int.com/python-training-course");
		Thread.sleep(2000);
		m.manage().window().maximize();
		Thread.sleep(2000);
		
		m.findElement(By.cssSelector("a[class=navbar-brand]")).click();	
		Thread.sleep(2000);
		m.close();
	}

}


