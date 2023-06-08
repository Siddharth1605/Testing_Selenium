package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://j2store.net/free/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		title.contains("Home");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		Thread.sleep(2000);
		String curtitle = driver.getTitle();
		curtitle.contains("Shop");
		Thread.sleep(3000);
		driver.quit();
	}
}
