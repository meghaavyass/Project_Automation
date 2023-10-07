package com.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation FIles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Shreyansh");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Agola");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("todd.nagasato@gmail.com");
		Thread.sleep(1000);
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		radiobutton.click();
		driver.findElement(By.id("userNumber")).sendKeys("9157238001");
		Thread.sleep(1000);
//		date script Panding
//		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).sendKeys("Testing Purpose");
//		Thread.sleep(1000);
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		checkbox.click();
		Thread.sleep(1000);
		WebElement file=driver.findElement(By.id("uploadPicture"));
		file.sendKeys("C:\\Users\\hp\\Downloads\\Swaminarayan Bhagwan");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("CTM");
		Thread.sleep(1000);
//		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")));
//		dropdown.selectByVisibleText("Uttar Pradesh");
//		Thread.sleep(1000);
//		Select dropdown1=new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")));
//		dropdown1.selectByVisibleText("Lucknow");
//		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
