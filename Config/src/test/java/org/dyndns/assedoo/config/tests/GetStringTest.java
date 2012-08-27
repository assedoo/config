/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.dyndns.assedoo.config.utils.WriteProperty;

import org.dyndns.assedoo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 12:47:28 PM
 *
 */
public class GetStringTest extends GeneralTest {
	
	private static final String KEY = "GetStringTest";
	private static final String VALUE = "value";
	
	@Test
	public void test() {
		boolean result = false;
		try {
			new WriteProperty(FILENAME, KEY + "=" + VALUE);
			result = Config.getInstance().getString(KEY).equals(VALUE);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);
	}

}
