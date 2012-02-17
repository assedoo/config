/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 16, 2012
 *
 */

package org.dyndns.assedoo.tests;

import org.dyndns.assedoo.config.Config;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase {
	
	public MainTest( String testName )
    {
        super( testName );
    }
	
	public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }
	
	public void MainTestConfig() {
		Config.getInstance();
		
		assertTrue( true );
	}

}
