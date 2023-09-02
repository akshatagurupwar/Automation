package com.testng;

import org.testng.annotations.Test;

public class SecondTest {

	@Test(priority = -1, invocationCount = 3)
	public void log() {
		System.out.println("log method");
		}

	@Test(priority = 0, dependsOnMethods = "addtocart")
	public void search() {
		System.out.println("Search method");

	}

	@Test(priority = 1, dependsOnMethods = { "log", "checkout" })
	public void addtocart() {
		System.out.println("add to cart");
	}

	/*
	 * @Test (priority=2,enabled=false)
	 */

	@Test(priority = 2)
	public void checkout() {
		System.out.println("checkout method");
		}
}
