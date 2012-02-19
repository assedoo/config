/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 17, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class GetInstance extends TestCase {
	
	private File file;
	
	public void setUp() {
		
		file = new File("config/config.properties");
		if(file.exists()) {
			file.delete();
		}
	}
	
	public void testGetInstance() throws IOException {

		Config.getInstance();

		assertTrue(file.exists());
	}
	
}
