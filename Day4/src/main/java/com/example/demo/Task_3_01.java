package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_3_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Dharunkumar");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuee020@skct.edu.in");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Dharun@007");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		driver.quit();
	}
}
