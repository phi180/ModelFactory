package org.phi.naruto.model.factory;

import org.phi.naruto.model.factory.model.ModelsFolder;

public class CLI {
	
	/** ho in input degli url, scarico le pagine, le lavoro e poi il modello */
	/**
	 * le pagine vengono scaricate in una cartella temporanea
	 * */
	
	public void computeModels() {
		ModelsFolder modelsFolder = new ModelsFolder();
		modelsFolder.beginComputation();
	}
	
	public static void main(String[] args) {
		new CLI().computeModels();
	}
}
