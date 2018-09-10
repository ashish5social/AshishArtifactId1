package com.ashish.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	
	@Test
	public void Mul() {
		System.out.println("Mul test");
		Assert.assertEquals(105, 10*10);
	}

	@Test
	public void Div() {
		System.out.println("Div test");
		Assert.assertEquals(2, 20/10);
	}
}
