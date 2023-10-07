package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSerisePractice2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://megaone.acrothemes.com/index-creative-startup.html");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		Actions a=new Actions(cd);
		WebElement we=cd.findElement(By.name("userName"));
		Action a1=a
				.moveToElement(we)
				.click()
				.keyDown(we,Keys.SHIFT)
				.sendKeys("s")
				.keyUp(we,Keys.SHIFT)
				.sendKeys("hreyansh")
				.doubleClick()
				.contextClick()
				.build();
		a1.perform();
		Thread.sleep(2000);
		WebElement we1=cd.findElement(By.name("userEmail"));
		Action a2=a
				.moveToElement(we1)
				.click()
				.keyUp(we1,Keys.SHIFT)
				.sendKeys("shreyanshagola2411@gmail.com")
				.doubleClick()
				.contextClick()
				.build();
		a2.perform();
		Thread.sleep(2000);
		WebElement we3=cd.findElement(By.cssSelector("input.form-control"));
		Action a3=a
				.moveToElement(we3)
				.click()
				.keyDown(we3,Keys.SHIFT)
				.sendKeys("h")
				.keyUp(we3,Keys.SHIFT)
				.sendKeys("i this is an")
				.keyDown(we3,Keys.SHIFT)
				.sendKeys("a")
				.keyUp(we3,Keys.SHIFT)
				.sendKeys("utomation")
				.build();
		a3.perform();
		Thread.sleep(2000);
		//cd.findElement(By.cssSelector("a.btn purple-btn rounded-pill w-100 contact_btn")).click();
		//Thread.sleep(2000);
		cd.close();
		
	}

}
