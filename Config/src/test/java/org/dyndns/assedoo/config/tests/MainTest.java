/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import org.dyndns.assedoo.config.Config;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Config.
 */
public class MainTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testConfig() {
    	Config.getInstance();
    	
    	assertTrue(true);
    }

}
