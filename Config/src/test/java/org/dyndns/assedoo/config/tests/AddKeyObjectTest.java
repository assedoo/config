/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.dyndns.assedoo.config.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 11:07:06 AM
 *
 */
public class AddKeyObjectTest extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final Object VALUE = 1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		new File(FILENAME).delete();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		new File(FILENAME).delete();
	}

	@Test
	public void testAddKeyObject() {
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
