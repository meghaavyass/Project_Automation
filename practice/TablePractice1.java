package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.guru99.com/test/write-xpath-table.html");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		
		String tr1=cd.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(tr1);
		Thread.sleep(2000);
		
		String tr2=cd.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(tr2);
		Thread.sleep(2000);
		
		String td1=cd.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(td1);
		Thread.sleep(2000);
		
		String td2=cd.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(td2);
		Thread.sleep(2000);
		
		cd.close();
	}

}
