package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseImageLink {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.apple.com/in/logic-pro/");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("a[id=globalnav-menubutton-link-search]")).click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("input.globalnav-searchfield-input")).sendKeys("I phone 14");
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("button.globalnav-searchfield-submit")).click();
		Thread.sleep(2000);
		cd.close();
	}

}
