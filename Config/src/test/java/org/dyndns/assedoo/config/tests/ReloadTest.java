/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ReloadTest extends TestCase {
	
	private static final String FILENAME = "config/config.properties";
	private static final String KEY = "key";
	private static final String VALUE1 = "value1";
	private static final String VALUE2 = "value2";
	
	@Before
	public void setUp() throws IOException {
		
		new WriteProperty(FILENAME, KEY + "=" + VALUE1);
	}

	@Test
	public void testReload() throws IOException {
		
		Config.getInstance();
		new WriteProperty(FILENAME, KEY + "=" + VALUE2);
		Config.getInstance().reload();
		assertTrue(Config.getInstance().getString(KEY).equals(VALUE2));
	}
}
