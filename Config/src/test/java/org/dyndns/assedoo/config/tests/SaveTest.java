/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.dyndns.assedoo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 12:56:42 PM
 *
 */
public class SaveTest extends GeneralTest {

	private static final String KEY = "SaveTest";
	private static final String VALUE = "value";
	
	@Test
	public void test() {
		File file = new File(FILENAME);
		boolean result = false;
		try {
			Config.getInstance().addKey(KEY, VALUE);
			Config.getInstance().save();
			FileInputStream fileInputStream = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInputStream);
			fileInputStream.close();
			result = properties.containsKey(KEY);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);	
	}
}
