package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUpWindowPractice5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://byjus.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/div/div[4]/a")).click();
		Thread.sleep(3000);
		
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> next=set.iterator();
		
		while(next.hasNext())
		{
			String childwindow=next.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.findElement(By.name("mkt_name")).sendKeys("Samarth");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/form/form/div[2]/div/div/input")).sendKeys("9157238002");
				Thread.sleep(3000);
				driver.findElement(By.name("mkt_email_address")).sendKeys("bittuagola3065@gmail.com");
				Thread.sleep(3000);
				Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/form/form/div[4]/div/select")));
				Thread.sleep(3000);
				dropdown.selectByVisibleText("Gujarat");
				Thread.sleep(3000);
//				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/form/form/div[5]/button")).click();
//				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(mainwindow);
		driver.close();
	}

}
