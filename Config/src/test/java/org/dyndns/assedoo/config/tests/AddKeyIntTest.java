/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import junit.framework.TestCase;

import org.dyndns.assedoo.config.Config;
import org.dyndns.assedoo.config.utils.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 26, 2012
 * @time 7:48:05 PM
 *
 */
public class AddKeyIntTest extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final int VALUE = 1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		FileUtils.deleteFile(FILENAME);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		FileUtils.deleteFile(FILENAME);
	}

	@Test
	public void testAddKeyInt() {
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
