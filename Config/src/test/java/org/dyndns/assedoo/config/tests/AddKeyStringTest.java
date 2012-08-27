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
 * @time 11:19:36 AM
 *
 */
public class AddKeyStringTest extends GeneralTest {
	
	private static final String KEY = "AddKeyStringTest";
	private static final String VALUE = "value";

	@Test
	public void test() {
		boolean result = false;
		try {
			Config.getInstance().addKey(KEY, VALUE);
			result = Config.getInstance().getProperties().containsKey(KEY);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);
	}

}
