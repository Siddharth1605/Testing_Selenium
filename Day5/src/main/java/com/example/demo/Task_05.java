package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_05 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).click();
		WebElement txt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"));
		System.out.print(txt.getText());
		System.out.print(txt.getTagName());
		WebElement bu = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0_filter\"]/label/input"));
		System.out.print(bu.getSize());
		System.out.print(bu.getCssValue("color"));
		driver.quit();
	}
}
