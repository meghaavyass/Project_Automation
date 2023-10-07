package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSeriesDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver cdo=new ChromeDriver();
		
		cdo.get("https://www.facebook.com/");
		Thread.sleep(2000);
		cdo.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a=new Actions(cdo);
		//we have to performe so many actions so eene 'a' ma store karavi dithi
		WebElement we=cdo.findElement(By.name("email"));
		
		Action soa=a
				.moveToElement(we)
				.click()
				.keyDown(we,Keys.SHIFT)
				.sendKeys("shrey")
				.keyUp(we,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				//Double click karine right click karva mate 
				.build();
		soa.perform();
		Thread.sleep(2000);		
		cdo.close();
	}

}
