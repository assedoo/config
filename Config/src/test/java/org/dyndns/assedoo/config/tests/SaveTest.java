/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 19, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class SaveTest extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final String VALUE = "value";
	private File file;
	
	public void setUp() throws IOException {
		
		file = new File(FILENAME);
		file.delete();
	}
	
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
