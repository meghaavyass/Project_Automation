package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindowDemo {
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
		//To handle all the open window and switch between those window
		System.out.println(mw);
		
		Set<String> s1=d.getWindowHandles();
		//all windows are stored in s1
		
		Iterator<String> itr=s1.iterator();
		//string one by one read kare
		
		while(itr.hasNext())
			//hasnext check that we have another window if yes then transfer otherwise not 
			//basically it check we have new window or not 
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
