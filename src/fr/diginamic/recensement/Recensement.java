package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import fichier.Ville;

public  class Recensement  {

	private Path pathFile;
	private List<Ville> ville = new ArrayList<Ville>();
	
	
	public Recensement() throws IOException {
		this.getListVille();
	}

	public void getListVille() throws IOException {

		ArrayList<Ville> ville = new ArrayList<Ville>();

		this.pathFile = Paths.get("C:/Users/magag/Downloads/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		for (int i = 0; i < lines.size(); i++) {
			String[] line = lines.get(i).split(";");
//			ville.addAll(line[0]);
			if (i != 0) {
				String nom = line[6];
				int codeDep = Integer.parseInt(line[2].trim().replaceAll("[A-B]", ""));
				String nameRegion = line[1];
				int popTotal = Integer.parseInt(line[9].trim().replaceAll(" ", ""));
				Ville cityVille = new Ville(nom, codeDep, nameRegion, popTotal);
				ville.add(cityVille);
				i++;
			}
		}

	}

	public Path getPathFile() {
		return pathFile;
	}

	public void setPathFile(Path pathFile) {
		this.pathFile = pathFile;
	}

	public List<Ville> getVille() {
		return ville;
	}

	public void setVille(List<Ville> ville) {
		this.ville = ville;
	}

	

}
