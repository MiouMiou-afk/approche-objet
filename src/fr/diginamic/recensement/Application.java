package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		Recensement resRecensement = new Recensement();
		resRecensement.getVille();
	}

}
