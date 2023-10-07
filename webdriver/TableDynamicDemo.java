package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamicDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation FIles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//columns
		
//		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		System.out.println("Number of Columns are : "+columns.size());
//		//if we want text from columns or rows then we have to run for loop
//		for(WebElement w:columns)
//			//webelement is an interface w is a refreance and columns is an object of columns list
//		{
//			System.out.println(w.getText());
//			//columns na text madshe 
//			Thread.sleep(1000);
//		}
		
		//rows
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		//if we want only one row then xpath ma tr[1] hashe eeni jagyaa ee tr kari devanu
		System.out.println("Number of Rows are : "+rows.size());
		for(WebElement w1:rows)
		{
			System.out.println(w1.getText());
			Thread.sleep(1000);
		}
		
		driver.close();
	}

}
