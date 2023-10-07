package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowPractice4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://store.wework.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/header/div/footer/div/div[1]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			if(!handle.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.findElement(By.cssSelector("input#cws_quickjobsearch_location")).sendKeys("Ahmedabad");
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("input#cws_quickjobsearch_keywords")).sendKeys("Software Testing");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"cws_quickjobsearch\"]/div[4]/input")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(handle);
		Thread.sleep(3000);
		driver.close();
	}

}
