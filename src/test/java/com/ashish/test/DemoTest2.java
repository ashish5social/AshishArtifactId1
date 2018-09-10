package com.ashish.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	@Test
	public void Diff() {
		System.out.println("Diff test");
		Assert.assertEquals(10, 20-10);
	}

}
