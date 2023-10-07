package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractise2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		c.manage().window().maximize();
		Thread.sleep(2000);
		c.findElement(By.name("cusid"))
		.sendKeys("shrey@123");
		c.findElement(By.name("submit"))
		.click();
		Alert a=c.switchTo().alert();
		String string=a.getText();
		System.out.println(string);
		Thread.sleep(2000);
		a.accept();
		c.close();
	}

}
