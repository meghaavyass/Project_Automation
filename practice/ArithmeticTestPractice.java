package com.practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class ArithmeticTestPractice {
	
	private int fno;
	private int sno;
	private int result;
	
	private ArithmeticPractice arith;
	
	
	public ArithmeticTestPractice(int fno, int sno, int result)
	{
		System.out.println("Parameterized Constructor Called");
		this.fno = fno;
		this.sno = sno;
		this.result = result;
	}
	
	@Before
	public void initialize()
	{
		System.out.println("Before Called");
		this.arith = new ArithmeticPractice();
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		System.out.println("Input Called");
		return Arrays.asList(new Object[][] {{1,2,-1},{10,20,-10},{23,23,0}});
	}
	
	@Test
	public void parameterizedTest()
	{
		System.out.println("Sub : "+result);
		assertEquals(result, arith.sub(fno, sno));
	}

}
