package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		//chrome driver ni exe file banavi jema driver ni key and value kaya padi che eeno path che 
		ChromeDriver driver=new ChromeDriver();
		//chrome driver ma work karvanu che so chrome driver no object banavayo
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//windows ne maximum size ma kari
		Thread.sleep(2000);
		//delayed aapyo 2 sec. no
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//aapde koi info joiti hoy eena mate aavi rite lakhay
		
		driver.findElement(By.name("email")).sendKeys("Shreyansh");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Shreyansh@agola2411");
		Thread.sleep(2000);
		driver.close();
		
	}

}
