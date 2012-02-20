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
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class GetInstanceConfigFileTest extends TestCase {
	
	private static final String FILENAME = "config/testconfig.properties";
	private File file;
	
	@Before
	public void setUp() {
		
		file = new File(FILENAME);
		if(file.exists()) {
			file.delete();
		}
	}

	@Test
	public void testGetInstanceConfigFile() throws IOException {
		
		Config.getInstance(FILENAME);

		assertTrue(file.exists());
	}

}
