package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Task_Class {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver gm=new ChromeDriver();
		
		gm.get("https://accounts.google.com/");
		Thread.sleep(2000);
		gm.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions as=new Actions(gm);
		WebElement wb=gm.findElement(By.name("identifier"));
		
		Action an=as
				.moveToElement(wb)
				.click()
				.keyUp(wb,Keys.SHIFT)
				.sendKeys("shreyanshagola2411@gmail.com")
				.doubleClick()
				.build();
		an.perform();
		Thread.sleep(2000);
		gm.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		gm.close();
	}

}
