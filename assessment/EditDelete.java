package com.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditDelete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation FIles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-record-1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"delete-record-1\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
