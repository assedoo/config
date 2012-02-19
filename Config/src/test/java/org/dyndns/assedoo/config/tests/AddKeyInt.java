/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 19, 2012
 *
 */

package org.dyndns.assedoo.config.tests;

import java.io.File;
import java.io.IOException;

import org.dyndns.assedoo.config.Config;

import junit.framework.TestCase;

public class AddKeyInt extends TestCase {
	
	private static final String KEY = "key";
	private static final String FILENAME = "config/config.properties";
	private static final int VALUE = 1;
	
	public void setUp() throws IOException {
	
		new File(FILENAME).delete();
	}
	
	public void testAddKeyInt() throws IOException {
		Config.getInstance().addKey(KEY, VALUE);

		assertTrue(Config.getInstance().getProperties().containsKey(KEY));	
	}

}