/**
 * 
 */
package ua.od.assedo.config.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import ua.od.assedo.config.Config;
import ua.od.assedo.config.utils.FileUtils;
import org.junit.After;
import org.junit.Test;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 11:36:37 AM
 *
 */
public class GetInstanceConfigFileTest extends GeneralTest {
	
	protected static final String TESTFILENAME = "config/testconfig.properties";
	
	@After
	public void tearDown() {
		Config.unSet();
		FileUtils.deleteEntity(TESTFILENAME, true);
	}
	
	@Test
	public void test() {
		File file = new File (TESTFILENAME);
		try {
			Config.getInstance(TESTFILENAME);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertTrue(file.exists());
	}

}
