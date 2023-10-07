package com.practice;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ArithmeticTest2 {
	
	int fno;
	int sno;
	int result;
	
	ArithmeticPractise2 ref;
	
	public ArithmeticTest2(int fno, int sno, int result)
	{
		this.fno=fno;
		this.sno=sno;
		this.result=result;
	}
	
	@Before
	public void obj()
	{
		this.ref=new ArithmeticPractise2();
	}
	
	@Parameterized.Parameters
	public static Collection in()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{2,3,5},{3,4,7}});
	}
	
	@Test
	public void output()
	{
		System.out.println("Total Sum : "+result);
		assertEquals(result, ref.meth(fno, sno));
	}

}
