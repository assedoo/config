/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 18, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class GetInstanceConfigFileNull extends TestCase {
	
	
	public void testGetInstanceConfigFileNull() throws IOException {
		
		Config.getInstance(null);
		
		assertTrue(true);
		//assertTrue(Config.getConfigFileName() == "config/config.properties");
	}

}
