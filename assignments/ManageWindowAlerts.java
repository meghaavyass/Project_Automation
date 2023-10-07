package com.assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowAlerts {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		
		String mw=d.getWindowHandle();
		System.out.println(mw);
		Set<String> s1=d.getWindowHandles();
		
		Iterator<String> itr=s1.iterator();
	
		while(itr.hasNext())			
		{
			String childwindow=itr.next();
			if(!mw.equalsIgnoreCase(childwindow))
			{
				d.switchTo().window(childwindow);
				Thread.sleep(2000);
				d.findElement(By.name("emailid")).sendKeys("shrey@gmail.com");
				Thread.sleep(2000);
				d.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				d.close();
			}
		}
		d.switchTo().window(mw);
		Thread.sleep(2000);
		d.close();
	}

}
