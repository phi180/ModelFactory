package org.phi.naruto.model.factory.filesystem;

public class OutputCsvFolder extends Folder {
	
	public final static String PATH = "csv/";
	
	public OutputCsvFolder() {
		super();
	}

	@Override
	protected String getFolderAddress() {
		return PATH;
	}
	
	

}
