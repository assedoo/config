/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.dyndns.assedoo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Sep 23, 2012
 * @time 7:49:57 PM
 *
 */
public class SaveWithCommentsTest extends GeneralTest {

	private static final String KEY = "SaveWithCommentsTest";
	private static final String VALUE = "value";
	private static final String COMMENTS = "Comments";
	
	@Test
	public void test() {
		File file = new File(FILENAME);
		boolean result = false;
		try {
			Config.getInstance().addKey(KEY, VALUE);
			Config.getInstance().save(COMMENTS);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(COMMENTS)) {
					result = true;
					break;
				}
			}
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(result);	
	}
}
