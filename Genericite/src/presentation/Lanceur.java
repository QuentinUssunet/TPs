package presentation;

import domaine.Paire;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paire<String> p = new Paire<String>("TATA","YOYO");
		String x = p.getPremier();
		String y = p.getSecond();
		
		Paire<Integer> p2 = new Paire<Integer>(10,12);
		int a = p2.getPremier();
		int b = p2.getSecond();
	}

}
