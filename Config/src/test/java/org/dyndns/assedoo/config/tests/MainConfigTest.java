/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 17, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class MainConfigTest extends TestCase {
	
	private static final String CONFIGFILENAME = "config/config.properties";
	
	public void setUp() {
		
	}
	
	public void testConfig() {
		new Config(CONFIGFILENAME);
		
		assertTrue(true);
	}
	
	public void tearDown() {
		
	}

}
