/**
 * 
 */
package ua.od.assedo.config.tests;

import static org.junit.Assert.*;

import java.io.IOException;

import ua.od.assedo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 11:07:06 AM
 *
 */
public class AddKeyObjectTest extends GeneralTest {
	
	private static final String KEY = "AddKeyObjectTest";
	private static final Object VALUE = 1;
	
	@Test
	public void test() {
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
