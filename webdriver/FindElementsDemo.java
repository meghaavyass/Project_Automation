package com.webdriver;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver cdr=new ChromeDriver();
		
		cdr.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		cdr.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> List=cdr.findElements(By.name("name"));
		System.out.println(List.size());
		
		for(int i=0;i<List.size();i++)
		{
			System.out.println(List.get(i).getAttribute("value"));
		}
		Thread.sleep(2000);
		cdr.close();
	}

}
