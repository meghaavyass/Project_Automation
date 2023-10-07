package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamicPractice1 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/web-table-element.php#");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> rows=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		System.out.println("number of rows are : "+rows.size());
		for(WebElement w1:rows)
		{
			System.out.println(w1.getText());
			Thread.sleep(200);
		}
		
		List<WebElement> columns=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr[1]/th"));
		System.out.println("Number of Columns Are : "+columns.size());
		for(WebElement w2:columns)
		{
			System.out.println(w2.getText());
			Thread.sleep(200);
		}
		d.close();
		
	}
}
