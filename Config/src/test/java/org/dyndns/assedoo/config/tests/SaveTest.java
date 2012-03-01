/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.dyndns.assedoo.config.Config;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SaveTest extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final String VALUE = "value";
	private File file;
	
	@Before
	public void setUp() throws IOException {
		
		file = new File(FILENAME);
		file.delete();
	}

	@Test
	public void testSave() throws IOException {
		
		Config.getInstance().addKey(KEY, VALUE);
		Config.getInstance().save();
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		fileInputStream.close();
		
		assertTrue(properties.containsKey(KEY));	
		//assertTrue(false);
		
	}

}
