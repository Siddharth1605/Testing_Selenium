package com.example.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_02 {

	int num1 = 20;
	int num2 = 10;

	@Test(priority = 1)
	public void add() {
		int sum = num1 + num2;
		Assert.assertEquals(sum, 30);
	}

	@Test(priority = 2)
	public void subtract() {
		int minus = num1 - num2;
		Assert.assertEquals(minus, 10);
	}

	@Test(priority = 3)
	public void multiply() {
		int mul = num1 * num2;
		Assert.assertEquals(mul, 200);
	}

	@Test(priority = 4)
	public void divide() {
		int div = num1 / num2;
		Assert.assertEquals(div, 2);
	}
}
