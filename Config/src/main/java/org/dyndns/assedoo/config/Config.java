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
	
	private static volatile Config instance;
	private static String configFileName;
	private File configFile;
	private static Properties properties;
	private static FileInputStream fileInputStream;

	private Config() throws IOException {
		configFile = new File(configFileName);
		if (!configFile.exists()) createFile(configFile);
		fileInputStream = new FileInputStream(configFile);
		properties = new Properties();
		properties.load(fileInputStream);
		fileInputStream.close();
	}
	
	/** Get Config instance.
	 * 	Properties will be read from file: config/config.properties.
	 */
	public static Config getInstance() throws IOException {
		Config.configFileName = "config/config.properties";
		return initialization();
	}
	/** Get Config instance.
	 * 	Properties will be read from file: configFileName.
	 */
	public static Config getInstance(String configFileName) throws IOException {
		if (configFileName == null) Config.configFileName = "config/config.properties";
		else Config.configFileName = configFileName;
		return initialization();
	}
	
	/** Reload properties from file */
	public void reload() throws IOException {
		fileInputStream = new FileInputStream(configFile);
		properties.load(fileInputStream);
	}
	
	/** Get property as an string */
	public String getString(String key) {
		return properties.getProperty(key);
	}
	
	/** Get property as an int */
	public int getInt(String key) {
		return Integer.parseInt(getString(key));
	}
	
	/** Add key to Properties
	 *  Note: Use save() method to save changes.
	 */
	public void addKey(String key) {
		properties.put(key, "");
	}
	
	/** Add key to Properties with string value
	 *  Note: Use save() method to save changes.
	 */
	public void addKey(String key, String value) {
		properties.put(key, value);
	}
	
	/** Add key to Properties with int value
	 *  Note: Use save() method to save changes.
	 */
	public void addKey(String key, int value) {
		properties.put(key, value);
	}
	
	/** Save changes */
	public void save() throws IOException {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(configFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		properties.store(fileOutputStream, null);
		fileOutputStream.close();
	}
	
	/** Get Properties */
	public Properties getProperties() {
		return properties;
	}
	
	private void createFile(File configFile) throws IOException {
		if (!configFile.getParentFile().exists()) createDirectories(configFile);
		configFile.createNewFile();
	}
	
	private void createDirectories(File configFile) {
		configFile.getParentFile().mkdirs();
	}
	
	private static Config initialization() throws IOException {
		Config localInstance = instance;
    	if (localInstance == null) {
    	synchronized (Config.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Config();
                }
            }
        }
        return localInstance;
    }
	
	protected void finalize() {
		try {
			save();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}