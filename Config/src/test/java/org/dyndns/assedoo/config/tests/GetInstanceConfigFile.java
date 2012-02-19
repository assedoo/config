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

public class GetInstanceConfigFile extends TestCase {
	
	public void testGetInstanceConfigFile() throws IOException {
		
		Config.getInstance("config/testconfig.properties");
		
		assertTrue(true);
		//assertTrue(Config.getConfigFileName() == "config/testconfig.properties");
	}

}
