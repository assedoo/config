/**
 * 
 */
package org.dyndns.assedoo.config.tests;

import org.dyndns.assedoo.config.Config;
import org.dyndns.assedoo.config.utils.FileUtils;
import org.junit.After;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 27, 2012
 * @time 3:09:39 PM
 *
 */
public class GeneralTest {
	
	protected static final String FILENAME = "config/config.properties";
	
	@After
	public void tearDown() {
		Config.unSet();
		FileUtils.deleteEntity(FILENAME, true);
	}
}
