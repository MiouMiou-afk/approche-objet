package fr.diginamic.operations;

public class Operations {
	private double a;
	private double b;
	private char operateur;

	public Operations(double a, double b, char operateur) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public double calcul(double a, double b, char operateur) {
		if (operateur == '+') {
			return a + b;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else {
			return a / b;
		}

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setoperateur(char operateur) {
		this.operateur = operateur;
	}

}