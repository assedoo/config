/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.dyndns.assedoo.config.Config;
import org.junit.Before;
import org.junit.Test;

public class PutValueTest extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final Object VALUE = 1;
	
	@Before
	public void setUp() throws IOException {
	
		new File(FILENAME).delete();
	}
	
	@Test
	public void testPutValueObject() throws IOException {
		Config.getInstance().putValue(KEY, VALUE);

		assertTrue(Config.getInstance().getProperties().containsKey(KEY));	
	}

}