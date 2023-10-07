package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RadarSeriseofActions {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver rad=new ChromeDriver();
		rad.get("http://64.227.103.212:8080/create-report/eyJpdiI6IithQi85Z1ZBbDhCRFY3YWtZS1A4Q2c9PSIsInZhbHVlIjoibDlEK2VpYUZvS1g5TmxOMWFpeGc5QT09IiwibWFjIjoiMGI4YzJiY2U0YTc1ZWJkY2JkMjM3ZDQ4ZTQwNTQxNzI4NDk5NWM1MjZlY2RjOGI5N2QyZGQyYTgwMTM2MWI1YSIsInRhZyI6IiJ9#step-3");
		Thread.sleep(5000);
		rad.manage().window().maximize();
		Actions steps=new Actions(rad);
		WebElement we1=rad.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		Action s1=steps
				.moveToElement(we1)
				.click()
				.sendKeys("shreyanshagola2411@gmail.com")
				.build();
		s1.perform();
		Thread.sleep(2000);
		WebElement we2=rad.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div[1]/input"));
		Action s2=steps
				.moveToElement(we2)
				.click()
				.sendKeys("Shrey@123")
				.build();
		s2.perform();
		Thread.sleep(2000);
		rad.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/input")).click();
		Thread.sleep(2000);
		rad.findElement(By.xpath("//*[@id=\"column-rendering-table\"]/tbody/tr/td[5]/div/ul/li/div/button/i")).click();
		Thread.sleep(2000);
		rad.findElement(By.xpath("//*[@id=\"column-rendering-table\"]/tbody/tr/td[5]/div/ul/li/div/div/div/a[1]/div[2]")).click();
		Thread.sleep(2000);
		rad.findElement(By.xpath("//*[@id=\"step-1\"]/div/form/div[2]/ul/li/button")).click();
		Thread.sleep(2000);
		rad.findElement(By.xpath("//*[@id=\"step-2\"]/div/form/div[2]/ul/li[3]/button")).click();
		Thread.sleep(2000);
		
		Select step1=new Select(rad.findElement(By.xpath("//*[@id=\"land-record-0-0\"]/div[2]/div[1]/div/div/span/span[1]/span/span[2]")));
		step1.selectByVisibleText("Little with Anel");
		
		Thread.sleep(4000);
		Select step2=new Select(rad.findElement(By.xpath("//*[@id=\"select2-species1-0-0-container\"]")));
		step2.selectByVisibleText("BRTE - Cheatgrass");
		
		Thread.sleep(4000);
		  
		rad.close();
	}

}
