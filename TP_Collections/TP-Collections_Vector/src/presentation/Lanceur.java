package presentation;

import java.util.List;
import java.util.Vector;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclarer et initialiser la collection
		List vect = new Vector();
		vect.add(12);
		vect.add("toto");
		vect.add(12.5);
		vect.add(-5.3);
		vect.add(12);
		
		// parcours de la liste (FOR) / accès à l'index
		for(int i = 0; i<vect.size(); i++) {
			System.out.println("Donnée à l'indice " + i + " = " +vect.get(i));			
		}
		
		// parcours de la liste (FOREACH = JAVA10-FOR) / pas accès à l'index
		for (Object item : vect) {
			System.out.println(item);			
		}
		
	}

}
