/**
 * 
 */
package ua.od.assedo.config.utils;

import java.io.File;

/**
 * @author assedoo
 * @email assedoo@gmail.com
 * @date Aug 26, 2012
 * @time 8:03:21 PM
 *
 */
public class FileUtils {
	
	public static boolean deleteEntity(String entityName) {
		return deleteEntity(entityName, false);
	}
	
	public static boolean deleteEntity(String entityName, boolean deleteParent) {
		
		File entity = new File(entityName);
		if (isEntityExist(entityName)) {
			System.out.println("Deleting entity: " + entityName);
			entity.delete();
			if (deleteParent) deleteFolder(entity.getParent());
			return true;
		}
		return false;
	}
	
	public static boolean isEntityExist (String entityName) {
		
		System.out.println("Checking entity: " + entityName);
		File entity = new File(entityName);
		if (entity.exists()) {
			System.out.println("Entity: " + entityName + " exists");
			return true;
		} else {
			System.out.println("Entity: " + entityName + " doesn't exist");
			return false;
		}
	}
	
	public static boolean deleteFolder (String folderName) {
		if (isEntityExist(folderName) && isEntityFolder(folderName))
			return deleteEntity(folderName);
		return false;
	}
	
	public static boolean isEntityFolder (String entityName) {
		System.out.println("Checking entity: " + entityName);
		if (new File(entityName).isDirectory()) {
			System.out.println("Entity: " + entityName + " is directory");
			return true;
		}
		System.out.println("Entity: " + entityName + " isn't directory");
		return false;
	}
}
