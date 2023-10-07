package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSeriesPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		c.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions s=new Actions(c);
		WebElement we=c.findElement(By.name("firstName"));
		Action a=s
				.moveToElement(we)
				.click()
				.keyDown(we,Keys.SHIFT)
				.sendKeys("s")
				.keyUp(we,Keys.SHIFT)
				.sendKeys("hreyansh")
				.build();
		a.perform();
		Thread.sleep(2000);
		WebElement we1=c.findElement(By.name("lastName"));
		Action a1=s
				.moveToElement(we1)
				.click()
				.keyDown(we1,Keys.SHIFT)
				.sendKeys("a")
				.keyUp(we1,Keys.SHIFT)
				.sendKeys("gola")
				.doubleClick()
				.contextClick()
				.build();
		a1.perform();
		Thread.sleep(2000);
		c.close();
				
	}

}
