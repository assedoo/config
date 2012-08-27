/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 12:50:28 PM
 *
 */
public class PutValueTest extends GeneralTest {

	private static final String KEY = "PutValueTest";
	private static final Object VALUE = 1;
	
	@Test
	public void test() {
		boolean result = false;
		try {
			Config.getInstance().putValue(KEY, VALUE);
			result = Config.getInstance().getProperties().containsKey(KEY);
		} catch (IOException e) {
			fail(e.getMessage());
		}	
		assertTrue(result);
	}
}
