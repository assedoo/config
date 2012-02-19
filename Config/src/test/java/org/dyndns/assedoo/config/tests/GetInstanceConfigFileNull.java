/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 18, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class GetInstanceConfigFileNull extends TestCase {
	
	private File file;
	
	public void setUp() {
		
		file = new File("config/config.properties");
		if(file.exists()) {
			file.delete();
		}
	}
	
	public void testGetInstanceConfigFileNull() throws IOException {
		
		Config.getInstance(null);
		
		assertTrue(file.exists());
	}

}
