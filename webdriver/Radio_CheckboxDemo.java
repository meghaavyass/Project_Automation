package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckboxDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver m=new ChromeDriver();
		m.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		m.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement r1=m.findElement(By.id("vfb-7-1"));
		r1.click();
		Thread.sleep(2000);
		WebElement r2=m.findElement(By.id("vfb-7-2"));
		r2.click();
		Thread.sleep(2000);
		WebElement r3=m.findElement(By.id("vfb-7-3"));
		r3.click();
		Thread.sleep(2000);
		
		WebElement c1=m.findElement(By.id("vfb-6-0"));
		c1.click();
		Thread.sleep(2000);
		WebElement c2=m.findElement(By.id("vfb-6-1"));
		c2.click();
		Thread.sleep(2000);
		WebElement c3=m.findElement(By.id("vfb-6-2"));
		c3.click();
		Thread.sleep(2000);
		c3.click();
		
		
		m.close();
	}

}
