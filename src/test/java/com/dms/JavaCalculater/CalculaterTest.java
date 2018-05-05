package com.dms.JavaCalculater;

import junit.framework.TestCase;

public class CalculaterTest extends TestCase {

	Calculater cal = new Calculater();
	
    public void testAdd()
    {
        assertTrue( 2 == cal.Add(1, 1) );
    }
    
    public void testDiv()
    {
        assertTrue( 2 == cal.Div(4, 2) );
    }
    
    public void testMul()
    {
        assertTrue( 1 == cal.Mul(1, 1) );
    }
    
    public void testSub()
    {
        assertTrue( 2 == cal.Sub(4, 2) );
    }
    
    public void testDivDouble()
    {
        assertTrue( 2 == cal.DivDouble(4.5, 0.0) );
    }
    
    public void testSubDouble()
    {
        assertTrue( 2 == cal.SubDouble(4.5, 2.5) );
    }
    
    public void testAddMute()
    {
        assertTrue( 2 == cal.Add(1, 2) );
    }
    
    public void testDivMute()
    {
        assertTrue( 1 == cal.Div(4, 3) );
    }
    
    public void testMulMute()
    {
        assertTrue( 1 == cal.Mul(1, 2) );
    }
    
    public void testSubMute()
    {
        assertTrue( 2 == cal.Sub(4, 3) );
    }
	
	public void testAddOperation()
    {
        assertTrue( 2 == cal.Add(1, 1) );
    }
	
	public void testSubOperation()
    {
        assertTrue( 1 == cal.Add(2, 1) );
    }
}
