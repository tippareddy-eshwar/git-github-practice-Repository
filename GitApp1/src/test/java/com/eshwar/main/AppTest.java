package com.eshwar.main;
import org.junit.Test;
import junit.framework.TestCase;
public class AppTest  extends TestCase
{
	@Test
	public void testSumWithBigValues()
	{
		int val1=70000;
		int val2=80000;
		App app=new App();
		int exceptedResult=150000;
		int actualResult=app.sum(val1, val2);
		assertEquals(exceptedResult, actualResult);
		
	}
	@Test
	public void testSumWithSmallValues()
	{
		int val1=700;
		int val2=800;
		App app=new App();
		int exceptedResult=1500;
		int actualResult=app.sum(val1, val2);
		assertEquals(exceptedResult, actualResult);
		
	}
	@Test
	public void testSumWithMixedValues()
	{
		int val1=50;
		int val2=-70;
		App app=new App();
		int exceptedResult=-20;
		int actualResult=app.sum(val1, val2);
		assertEquals(exceptedResult, actualResult);
		
	}
	
	@Test
	public void testSumWithNegativeValues()
	{
		int val1=-50;
		int val2=-70;
		App app=new App();
		int exceptedResult=-120;
		int actualResult=app.sum(val1, val2);
		assertEquals(exceptedResult, actualResult);
		
	}
	
}
