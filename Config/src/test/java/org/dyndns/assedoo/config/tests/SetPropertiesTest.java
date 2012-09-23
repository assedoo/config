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
 * @date Sep 10, 2012
 * @time 7:20:20 PM
 *
 */
public class SetPropertiesTest extends GeneralTest {

	private static final String KEY = "SetPropertiesTest";
	private static final String VALUE = "value";
	
	@Test
	public void test() {
		File file = new File(FILENAME);
		file.delete();
		boolean result = false;
		try {
			Properties properties = new Properties();
			properties.put(KEY, VALUE);
			Config.getInstance().setProperties(properties);
			Config.getInstance().save();
			result = Config.getInstance().getProperties().equals(properties);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);
	}
}
