/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 18, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class ReloadTest extends TestCase {
	
	private static final String FILENAME = "config/config.properties";
	private static final String KEY = "key";
	private static final String VALUE1 = "value1";
	private static final String VALUE2 = "value2";
	
	public void setUp() throws IOException {
		
		new WriteProperty(FILENAME, KEY + "=" + VALUE1);
	}
	
	public void testReload() throws IOException {
		
		Config.getInstance();
		new WriteProperty(FILENAME, KEY + "=" + VALUE2);
		Config.getInstance().reload();
		assertTrue(Config.getInstance().getString(KEY).equals(VALUE2));
	}
}
