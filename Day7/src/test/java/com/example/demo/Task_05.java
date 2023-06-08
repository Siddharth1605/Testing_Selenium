package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_05 {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.godaddy.com/en-in");
	}

	@Test(groups = { "SmokeTest" })
	public void testcase_01() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://www.godaddy.com/en-in");
	}

	@Test(groups = { "RegressionTest" })
	public void testcase_02() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a"))
				.click();
	}

	@Test(dependsOnGroups = { "RegressionTest" })
	public void testcase_03() throws InterruptedException {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "GoDaddy Domain Search - Buy and Register Available Domain Names");
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		searchbox.isDisplayed();
		WebElement buyit = driver.findElement(By.xpath(
				"//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
		buyit.isDisplayed();
		searchbox.sendKeys("mydomain");
		buyit.click();
		WebElement addtocart = driver.findElement(By.xpath(
				"//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button"));
		addtocart.isDisplayed();
		WebElement price = driver.findElement(By.xpath(
				"//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span"));
		price.isDisplayed();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
