package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SecondTest2 {

	@Test(priority = -1)
	public void log() {
		System.out.println("log method");
		Assert.assertEquals(false, true);
		}

	@Test(priority = 0)
	public void search() {
		System.out.println("Search method");
		Assert.assertEquals(false, true);

	}

	@Test(priority = 1)
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
