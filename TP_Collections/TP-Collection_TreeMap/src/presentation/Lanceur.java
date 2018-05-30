package presentation;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import domaine.Personne;

public class Lanceur {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SortedMap <	Integer, Personne> map = Collections.synchronizedSortedMap(new TreeMap<>());
	
	Personne p1 = new Personne(1, "TATA","Eddy");
	Personne p2 = new Personne(2,"TATA","Elise");
	Personne p3 = new Personne(3, "AEGHIP", "Doug");
	Personne p4 = new Personne(4, "LALANE", "Francis");

	map.put(1, p1);
	map.put(2, p2);
	map.put(38, p4);
	map.put(46, p3);
	
	//parcourir avec un for each
	
	for(Map.Entry<Integer, Personne> entry : map.entrySet()) {
		System.out.println(entry);
		System.out.println("----Clé----");
		System.out.println(entry.getKey());
		System.out.println("----Valeur----");
		System.out.println(entry.getValue());
		
		// comparaison par le nom et pas par la clef : sortedmap<Personne, String> avec la fonction compare
		//
	}
	}
}