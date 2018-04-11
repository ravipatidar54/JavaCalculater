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
        assertTrue( 2 == cal.Sub(4, 1) );
    }
}
