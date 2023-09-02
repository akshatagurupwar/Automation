package com.testng;

import org.testng.annotations.Test;

public class TestPoolSize {

	@Test(invocationCount = 8, threadPoolSize=4)
	public void log() throws InterruptedException{
		System.out.println("log method");
		System.out.println("Thread is: "+Thread.currentThread().getId());
		}

	@Test
	public void search() {
		System.out.println("Search method");

	}

	@Test
	public void addtocart() {
		System.out.println("add to cart");
	}

	/*
	 * @Test (priority=2,enabled=false)
	 */

	@Test
	public void checkout() {
		System.out.println("checkout method");
		}
}
