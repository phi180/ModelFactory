package org.phi.naruto.model.factory.filesystem;

public class OutputModelsFolder extends Folder {

	public final static String PATH = "models/";
	
	public OutputModelsFolder() {
		super();
	}

	@Override
	protected String getFolderAddress() {
		return PATH;
	}
	
	
}
