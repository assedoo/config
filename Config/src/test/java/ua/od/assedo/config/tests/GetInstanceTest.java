/**
 * 
 */
package ua.od.assedo.config.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import ua.od.assedo.config.Config;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 12:35:43 PM
 *
 */
public class GetInstanceTest extends GeneralTest {
	
	@Test
	public void test() {
		File file = new File(FILENAME);
		try {
			Config.getInstance();
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(file.exists());
	}

}
