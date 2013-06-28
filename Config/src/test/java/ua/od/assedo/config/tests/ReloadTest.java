/**
 * 
 */
package ua.od.assedo.config.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import ua.od.assedo.config.Config;
import ua.od.assedo.config.utils.WriteProperty;

import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 12:52:47 PM
 *
 */
public class ReloadTest extends GeneralTest {

	private static final String KEY = "ReloadTest";
	private static final String VALUE1 = "value1";
	private static final String VALUE2 = "value2";
	
	@Test
	public void test() {
		boolean result = false;
		try {
			new WriteProperty(FILENAME, KEY + "=" + VALUE1);
			Config.getInstance();
			new WriteProperty(FILENAME, KEY + "=" + VALUE2);
			Config.getInstance().reload();		
			result = Config.getInstance().getString(KEY).equals(VALUE2);
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		assertTrue(result);
	}
}
