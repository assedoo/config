/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Config.
 */
public class MainConfigTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainConfigTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainConfigTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws IOException 
     */
    public void testConfig() throws IOException {
    	Config.getInstance();
    	
    	assertTrue(true);
    }

}
