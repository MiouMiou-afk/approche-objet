package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LectureFichier {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	ArrayList<Ville> ville = new ArrayList<Ville>();
		

		Path pathFile = Paths.get("C:/Users/magag/Downloads/recensement.csv");
		List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		for (int i=0; i< lines.size(); i++) {
		
			if(i!=0) {
			String[] line = lines.get(i).split(";");
			String nom = line[6];
			int codeDep= Integer.parseInt(line[2].trim().replaceAll("[A-B]" , "" ));
			String nameRegion= line[1];;
			int popTotal= Integer.parseInt(line[9].trim().replaceAll( " " , "" ));
			Ville cityVille = new Ville(nom, codeDep, nameRegion, popTotal);
			ville.add(cityVille);
			i++;
			}
		}
		
		
		//villes de plus de 25 000
		for (int i=1; i< ville.size(); i++) {
			if(ville.get(i).getPopTotal()< 25000) {
				ville.remove(i);
			}
			
		}
		
		System.out.println(ville.toString());
		System.out.println(ville.size());

		
	}

}
