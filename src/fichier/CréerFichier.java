package fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CréerFichier {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFile = Paths.get("C:/Users/magag/Downloads/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

		List<String> newFile = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {
			newFile.add(lines.get(i));
		}

		Path pathCible = Paths.get("C:/Users/magag/Downloads/recensementcopie1.csv");
		Files.write(pathCible, newFile);

		List<String> lines2 = Files.readAllLines(pathCible, StandardCharsets.UTF_8);
		System.out.println(lines2);
		System.out.println(lines2.size());

	}

}
