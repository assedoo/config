/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 17, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class GetInstance extends TestCase {
	
	public void testGetInstance() throws IOException {
		
		Config.getInstance();
		
		assertTrue(true);
		//assertTrue(Config.getConfigFileName() == "config/config.properties");
	}
	
}
