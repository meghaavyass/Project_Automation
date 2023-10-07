package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInTablePractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String table=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]/table/tbody/tr[5]/td[2]")).getText();
		String table1=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[1]/font")).getText();
		System.out.println(table1);
		System.out.println(table);
		Thread.sleep(2000);
		driver.close();
	}

}
