package presentation;

import java.util.Hashtable;
import java.util.Map;

public class Lanceur {

public static void main(String[] args) {
		
		// Attention on peut pr�ciser le type de la cl� et de la valeur
		//souvent la cl� est une id et la valeur un objet
		
		Map<Object, Object> ht = new Hashtable();
		
		//ajout de donn�es
		
		ht.put(1, "printemps");
		ht.put(3, "automne");
		ht.put(2, "�t�");
		ht.put(4, "hiver");
		
		//parcourir avec un for each
		
		for(Map.Entry<Object, Object> entry : ht.entrySet()) {
			System.out.println(entry);
			System.out.println("----Cl�----");
			System.out.println(entry.getKey());
			System.out.println("----Valeur----");
			System.out.println(entry.getValue());
		}
}
}


