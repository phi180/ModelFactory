package org.phi.naruto.model.factory.model;

import java.util.List;

import org.phi.naruto.model.factory.filesystem.InputUrlsFolder;

public class ModelsFolder {
	
	public final static String INPUT_FOLDER = "models/";

	private List<NarutoModel> narutoModels;
	
	public void beginComputation() {
		for(String urlsFileName:new InputUrlsFolder().getListOfFiles())
			this.computeSingleModelFromPath(urlsFileName);
	}
	
	private void computeSingleModelFromPath(String fileName) {
		NarutoModel narutoModel = new NarutoModel(fileName);
		narutoModel.computeModel();
	}
	
}
