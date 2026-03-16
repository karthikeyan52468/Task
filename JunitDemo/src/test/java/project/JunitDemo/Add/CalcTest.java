package project.JunitDemo.Add;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest()
	{
		Calc obj= new Calc();
		assertEquals(10,obj.add(5, 5));
				
	}
	
	@Test(expected = ArithmeticException.class)
	public void exception()
	{
		Calc obj= new Calc();
		
		obj.div(10, 0);
				
	}
	
	@Test
	public void checkFalse() {
		
		assertFalse(false);
	}
	
	@Test
	public void checkTrue() {
		
		assertTrue(true);
	}
	
	
	@Test
	public void refTest()
	{
		String s1=new String("a");
		String s2=new String("a");
		assertNotSame(s1, s2);
		
	}
	
	@Test
	public void valueCheckTest()
	{
		String s1=new String("a");
		String s2=new String("a");
		assertEquals(s1, s2);
		
	}
	
	@Test
	public void nullCheck()
	{
		String s1=null;
		assertNull(s1);
	}
	
	@Test
	public void notNullCheck()
	{
		String s1="abc";
		assertNotNull(s1);
	}
	
	@Test
	public void arrayEqualTest()
	{
		int a[] = {5,4,3,2,1};
		int b[] = {1,2,3,4,5};
		Arrays.sort(a);
		assertArrayEquals(a, b);
	}
}
