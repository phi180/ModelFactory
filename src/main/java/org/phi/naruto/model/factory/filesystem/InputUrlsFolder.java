package org.phi.naruto.model.factory.filesystem;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.phi.naruto.model.factory.model.ModelsFolder;

public class InputUrlsFolder extends Folder {
	
	public final static String PATH = "sites_url/";
	
	public InputUrlsFolder() {
		super();
	}
	
	public Set<String> readModelUrlsFromFile(String name) {
		File modelUrlsFile = new File(InputUrlsFolder.PATH + name);
		Set<String> urls = new HashSet<>();
		
		try {
			urls.addAll(FileUtils.readLines(modelUrlsFile, "UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return urls;
	}

	@Override
	protected String getFolderAddress() {
		return PATH;
	}
	
}
