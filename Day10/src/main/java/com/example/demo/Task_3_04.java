package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_3_04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Dharunkumar");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727821tuee020@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Dharun@1104");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("dharunkumar1104@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)", "");
		driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("good");
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("10");
		js.executeScript("window.scrollBy(0,8000)", "");
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		Thread.sleep(1000);
	}
}
