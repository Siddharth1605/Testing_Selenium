package com.example.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_03 {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		value.sendKeys("401");
		WebElement submit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		submit.click();
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
		value.clear();
		value.sendKeys("402");
		submit.click();
		a.accept();
		
		Alert b=driver.switchTo().alert();
		String msg=b.getText();
		b.accept();
		System.out.println(msg);
	}
}
