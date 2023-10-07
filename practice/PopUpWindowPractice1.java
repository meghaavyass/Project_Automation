package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowPractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		cd.manage().window().maximize();
		Thread.sleep(2000);
		cd.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		
		String s=cd.getWindowHandle();
		System.out.println(s);
		
		Set<String> s1=cd.getWindowHandles();
		
		Iterator<String> itr=s1.iterator();
		
		while(itr.hasNext())
		{
			String CW=itr.next();
			if(!s.equalsIgnoreCase(CW))
			{
				cd.switchTo().window(CW);
				cd.findElement(By.name("emailid")).sendKeys("shrey@gmail.com");
				Thread.sleep(2000);
				cd.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				cd.close();
			}
		}
		cd.switchTo().window(s);
		Thread.sleep(2000);
		cd.close();
	}

}
