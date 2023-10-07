package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTag_ClassDemo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver m=new ChromeDriver();
		m.get("https://www.facebook.com/");
		Thread.sleep(2000);
		m.manage().window().maximize();
		Thread.sleep(2000);
		m.findElement(By.cssSelector("input#email")).sendKeys("Shreyansh");
		//css selector che tag and id, id ne # thi define karay and inout ee tag che
		Thread.sleep(2000);
		
		m.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Shrey@123");
		Thread.sleep(2000);
		m.close();
   }
}
