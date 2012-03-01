/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Feb 17, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import org.dyndns.assedoo.config.Config;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class GetInstanceTest extends TestCase {
	
	private File file;
	
	@Before
	public void setUp() {
		
		file = new File("config/config.properties");
		if(file.exists()) {
			file.delete();
		}
	}

	@Test
	public void testGetInstance() throws IOException {

		Config.getInstance();

		assertTrue(file.exists());
	}
	
}
