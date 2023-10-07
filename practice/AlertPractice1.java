package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("input[name=cusid]")).sendKeys("1234");
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("input[value=Submit]")).click();
		Thread.sleep(2000);
		Alert at=cd.switchTo().alert();
		String sg=at.getText();
		System.out.println(sg);
		Thread.sleep(2000);
		at.accept();
		cd.close();
		
	}
	

}
