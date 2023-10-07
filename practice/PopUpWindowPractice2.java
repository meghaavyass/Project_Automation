package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowPractice2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/p/a"))
		.click();
		
		String s=d.getWindowHandle();
		System.out.println(s);
		Set<String> ss=d.getWindowHandles();
		Iterator<String> itrs=ss.iterator();
		
		while(itrs.hasNext())
		{
			String cw=itrs.next();
			if(!s.equalsIgnoreCase(cw))
			{
				d.switchTo().window(cw);
				d.findElement(By.name("emailid"))
				.sendKeys("shrey@gmail.com");
				d.findElement(By.name("btnLogin"))
				.click();
				Thread.sleep(2000);
				d.close();
			}
		}
		d.switchTo().window(s);
		Thread.sleep(2000);
		d.close();

	}

}
