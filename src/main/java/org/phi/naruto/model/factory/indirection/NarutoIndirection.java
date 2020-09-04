package org.phi.naruto.model.factory.indirection;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.phi.naruto.model.factory.filesystem.OutputCsvFolder;
import org.phi.naruto.model.factory.filesystem.OutputModelsFolder;
import org.xml.sax.SAXException;

import naruto.api.NarutoExperiment;
import naruto.api.NarutoExtractor;

public class NarutoIndirection {
		
	public NarutoIndirection() {
		
	}
	
	public void computeModel(String name, String inputDirectory, int trainingSize) {
		NarutoExperiment experiment = new NarutoExperiment(name,Paths.get(inputDirectory),
				Paths.get(OutputCsvFolder.PATH),-1,trainingSize,false);
		
		NarutoExtractor extractor = new NarutoExtractor();
		
		try {
			extractor.runExperiment(experiment);
			extractor.saveLandmarkTree(Paths.get(OutputModelsFolder.PATH + name));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

}
