/**
 * @author pzastavny
 * @email pzastavny@lohika.com
 * @date Feb 16, 2012
 *
 */

package org.dyndns.assedoo.tests;

import org.dyndns.assedoo.config.Config;

public class MainTest {
	
	@Test
	public void perform() {
		Config.getInstance();
	}

}
