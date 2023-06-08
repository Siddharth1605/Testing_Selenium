package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_3_02 {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.opencart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		WebElement returns = driver.findElement(By.linkText("Returns"));
		returns.click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();
	}
}
