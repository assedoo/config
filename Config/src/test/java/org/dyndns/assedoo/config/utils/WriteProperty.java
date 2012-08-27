/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteProperty {
	
	public WriteProperty(String fileName, String property) throws IOException {
		
		File file = new File(fileName);
		file.delete();
		if (!file.getParentFile().exists())
			file.getParentFile().mkdirs();
		file.createNewFile();
		FileWriter fstream = new FileWriter(fileName);
		BufferedWriter out = new BufferedWriter(fstream);
		out.write(property);
		out.close();
	}
}
