package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ville {

	String nom;
	Integer nbHabitant;

	public Ville(String nom, Integer nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(Integer nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}
