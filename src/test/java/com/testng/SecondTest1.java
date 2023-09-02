package com.testng;

import org.testng.annotations.Test;

public class SecondTest1 {

	@Test(groups="Sanity")
	public void log() {
		System.out.println("log method");
		}

	@Test(groups="Regression")
	public void search() {
		System.out.println("Search method");

	}

	@Test(groups={"Regression","Sanity"})
	public void addtocart() {
		System.out.println("add to cart");
	}

	/*
	 * @Test (priority=2,enabled=false)
	 */

	@Test(groups="Regression")
	public void checkout() {
		System.out.println("checkout method");
		}
}
