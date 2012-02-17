/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Jan 27, 2012
 *
 */

package org.dyndns.assedoo.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public final class Config {
	
	private static String configPropertiesFileName;
	private Properties properties;
	
	private static Config _instance = null;
	
	public Config(String configPropertiesFileName) {
		if (configPropertiesFileName == null) configPropertiesFileName = "config/config.properties";
		Config.configPropertiesFileName = configPropertiesFileName;
		FileInputStream in = null;
		File configPropertiesFile = new File(configPropertiesFileName);
		if (properties == null) {
			properties = new Properties();
		}
		try {
			in = new FileInputStream(configPropertiesFileName);
		} catch (FileNotFoundException e) {
			if (!configPropertiesFile.exists()) {
				if (!createFile(configPropertiesFile)) {
					if (createDir(configPropertiesFile)) {
						if (createFile(configPropertiesFile)) {
							try {
								in = new FileInputStream(configPropertiesFileName);
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			}
		}
		try {
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static synchronized Config getInstance() {
		return getInstance(configPropertiesFileName);
	}
	
	public static synchronized Config getInstance(String configPropertiesFileName) {
        if (_instance == null)
            _instance = new Config(configPropertiesFileName);
        return _instance;
    }
	
	/** Get property as an integer */
	public String getString(String key){
		return properties.getProperty(key);
	}
	
	/** Set property as an integer */
	public int getInt(String key){
		return Integer.parseInt(getString(key));
	}
	
	/** Get property */
	public Properties getProperties() {
		return properties;
	}
	
	/** Set property */
	public void setProperties(Properties properties) {
		this.properties = properties;
		save();
	}
	
	/** Add property */
	
	public void addProperty (String name) {
		if (!properties.containsKey(name)) {
			properties.put(name, null);
			save();
		}
	}
	
	/** Add property with value */
	
	public void addProperty (String name, String value) {
		if (!properties.containsKey(name)) {
			properties.put(name, value);
			save();
		}
	}
	
	private boolean createDir (File file) {
		file.getParentFile().mkdir();
		return true;
	}
	
	private boolean createFile (File file) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	private void save() {
		FileOutputStream out;
		try {
			out = new FileOutputStream(configPropertiesFileName);
			properties.store(out, null);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
