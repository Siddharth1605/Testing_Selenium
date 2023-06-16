package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_04 {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		WebElement leaving=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		leaving.sendKeys("Coimbatore");
		WebElement going=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		going.sendKeys("Erode");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		date.sendKeys("17-06-2023",Keys.ENTER);
		Thread.sleep(1000);
	}
}
