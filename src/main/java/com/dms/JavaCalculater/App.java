package com.dms.JavaCalculater;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a=4,b=2;
    	Calculater cal = new Calculater();
        System.out.println(cal.Add(a, b));
        System.out.println(cal.Sub(a, b));
        System.out.println(cal.Div(a, b));
        System.out.println(cal.Mul(a, b));
    }
}
