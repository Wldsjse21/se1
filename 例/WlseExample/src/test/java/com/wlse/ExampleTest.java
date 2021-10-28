package com.wlse;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ExampleTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ExampleTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ExampleTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testAdd() {
        Example Example = new Example();
        int result = Example.add(50, 20);
        assertEquals(70, result);
    }
    public void testSub() {
        Example Example = new Example();
        int result = Example.sub(50, 20);
        assertEquals(30, result);
    }

    @Override
    public String toString() {
        return "ExampleTest []";
    }
}
