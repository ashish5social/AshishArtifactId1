package com.ashish.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void Sum() {
		System.out.println("SUM test");
		Assert.assertEquals(20, 10+10);
	}

}
