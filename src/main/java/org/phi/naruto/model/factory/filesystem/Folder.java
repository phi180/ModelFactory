package org.phi.naruto.model.factory.filesystem;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public abstract class Folder {
		
	public Folder() {
		this.makeDirectory();
	}
	
	private void makeDirectory() {
		if(!new File(this.getFolderAddress()).exists())
			new File(this.getFolderAddress()).mkdir();
	}
	
	protected abstract String getFolderAddress();
	
	public Set<String> getListOfFiles() {
		Set<String> filesList = new HashSet<>();
		
		File folder = new File(this.getFolderAddress());
		for(File file:folder.listFiles())
			filesList.add(file.getName());
		
		return filesList;
	}
	
}
