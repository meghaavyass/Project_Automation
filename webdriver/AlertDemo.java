package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.name("cusid")).sendKeys("1234");
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert a=d.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		Thread.sleep(2000);
		a.accept();
		d.close();
	}

}
