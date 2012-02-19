/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 19, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class GetStringTest extends TestCase {
	
	private static final String FILENAME = "config/config.properties";
	private static final String KEY = "key";
	private static final String VALUE = "value";
	
	public void setUp() throws IOException {
		
		new WriteProperty(FILENAME, KEY + "=" + VALUE);
	}
	
	public void testGetString() throws IOException {
		
		System.out.println(Config.getInstance().getString(KEY));
		assertTrue(Config.getInstance().getString(KEY).equals(VALUE));
	}

}
