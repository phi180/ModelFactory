package org.phi.naruto.model.factory.filesystem;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class InputPagesFolder extends Folder {

	public final static String PATH = "html/";
	
	public InputPagesFolder() {
		super();
	}
		
	public void deleteDirectoryFiles() {
		File directoryToBeDeleted = new File(PATH);
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            file.delete();
	        }
	    }	    
	}
	
	public void savePage(String filename,String content) {
		try {
			FileUtils.write(new File(PATH+filename), content,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int getDirectoryFilesNumber() {
		return new File(PATH).listFiles().length;
	}

	@Override
	protected String getFolderAddress() {
		return PATH;
	}
	
}
