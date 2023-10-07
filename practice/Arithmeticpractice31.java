package com.practice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class Arithmeticpractice31 {
	private int fno;
	private int sno;
	private int tno;
	private int result;
	
	Arithmetic3 ref3;
	
	Arithmeticpractice31(int fno, int sno, int tno, int result)
	{
		this.fno=fno;
		this.sno=sno;
		this.tno=tno;
		this.result=result;
	}
	
	@Before
	public void objj()
	{
		this.ref3=new Arithmetic3();
	}
	
	@Parameterized.Parameters
	public static Collection expected()
	{
		return Arrays.asList(new Object [][] {{1,2,3,6},{2,3,4,9},{3,4,5,12}});
	}
	
	@Test
	public void output()
	{
		System.out.println("Total Sum : "+result);
		assertEquals(result, ref3.input(fno, sno, tno));
	}
}
