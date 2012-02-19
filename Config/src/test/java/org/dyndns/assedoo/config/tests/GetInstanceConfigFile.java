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

public class GetInstanceConfigFile extends TestCase {
	
	private static final String FILENAME = "config/testconfig.properties";
	private File file;
	
	public void setUp() {
		
		file = new File(FILENAME);
		if(file.exists()) {
			file.delete();
		}
	}
	
	public void testGetInstanceConfigFile() throws IOException {
		
		Config.getInstance(FILENAME);

		assertTrue(file.exists());
	}

}
