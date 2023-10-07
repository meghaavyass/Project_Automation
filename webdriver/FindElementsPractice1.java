package com.webdriver;

import java.sql.Driver;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\champion\\\\Desktop\\\\Automation Tools\\\\chromedriver.exe");
		ChromeDriver cdr=new ChromeDriver();
		
		cdr.get("https://www.tops-int.com/python-training-course");
		Thread.sleep(2000);
		cdr.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> l=cdr.findElements(By.name("name"));
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getAttribute("id"));
		}
		System.out.println();
		Thread.sleep(2000);
		cdr.close();
	}

}
