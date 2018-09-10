package com.ashish.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	
	@Test
	public void Mul() {
		System.out.println("Mul test");
		Assert.assertEquals(100, 10*10);
	}

}
