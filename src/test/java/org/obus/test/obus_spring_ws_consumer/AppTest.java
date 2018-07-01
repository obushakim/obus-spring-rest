package org.obus.test.obus_spring_ws_consumer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.obus.test.obus_spring_ws_consumer.controller.KaryawanControllerDuaTest;
import org.obus.test.obus_spring_ws_consumer.controller.KaryawanControllerTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@RunWith(Suite.class)
@SuiteClasses({
	KaryawanControllerTest.class,
	KaryawanControllerDuaTest.class
})
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
