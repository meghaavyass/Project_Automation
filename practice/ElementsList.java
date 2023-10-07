package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsList {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.krishaweb.com/");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> l=cd.findElements(By.id("block-acf-our-work-css"));
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getAttribute("href"));
		}
		
		Thread.sleep(2000);
		cd.close();
	}

}
