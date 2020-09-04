package org.phi.naruto.model.factory.model;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.phi.naruto.model.factory.downloader.Downloader;
import org.phi.naruto.model.factory.filesystem.InputPagesFolder;
import org.phi.naruto.model.factory.filesystem.InputUrlsFolder;
import org.phi.naruto.model.factory.indirection.NarutoIndirection;


public class NarutoModel {
	
	private String name;
	
	public NarutoModel(String name) {
		this.name = name;
	}
	
	public void computeModel() {
		this.downloadPages();
		new NarutoIndirection().computeModel(name, InputPagesFolder.PATH, InputPagesFolder.getDirectoryFilesNumber());		
	}
	
	private void downloadPages() {
		/** First I have to delete old html pages in folder */
		InputPagesFolder pagesFolder = new InputPagesFolder();
		
		pagesFolder.deleteDirectoryFiles();
		Set<String> urls = new InputUrlsFolder().readModelUrlsFromFile(name);
		Downloader downloader = new Downloader();
		
		int i = 0;
		for(String url:urls) {
			String pageContent = downloader.download(url);
			pagesFolder.savePage(i + ".html", pageContent);
			i++;
		}
	}
	
	

}
