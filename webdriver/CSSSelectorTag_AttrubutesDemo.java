package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTag_AttrubutesDemo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver m=new ChromeDriver();
		m.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		m.manage().window().maximize();
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=firstName]")).sendKeys("Shreyansh");
		Thread.sleep(2000);
		m.findElement(By.name("lastName")).sendKeys("Agola");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=phone]")).sendKeys("9157238002");
		Thread.sleep(2000);
		m.findElement(By.id("userName")).sendKeys("shreyansh.agola@gmail.com");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=address1]")).sendKeys("Vastral, Ahmedabad");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=city]")).sendKeys("Ahmedabad");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=state]")).sendKeys("Gujarat");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=postalCode]")).sendKeys("382449");
		Thread.sleep(2000);
		
		m.findElement(By.id("email")).sendKeys("shreyanshAgola");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[type=password]")).sendKeys("Shreyansh@123");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[name=confirmPassword]")).sendKeys("Shreyansh@123");
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input[type=submit]")).click();
		m.close();
   }
}
