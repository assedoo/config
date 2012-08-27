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
 * @time 12:39:36 PM
 *
 */
public class GetIntTest extends GeneralTest {

	private static final String KEY = "GetIntTest";
	private static final int VALUE = 1;
	
	@Test
	public void test() {
		boolean result = false;
		try {
			new WriteProperty(FILENAME, KEY + "=" + VALUE);
			if (Config.getInstance().getInt(KEY) == VALUE)
				result = true;
			else
				result = false;
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);
	}

}
