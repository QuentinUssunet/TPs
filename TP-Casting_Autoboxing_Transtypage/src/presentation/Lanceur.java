package presentation;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CASTING EXEMPLE
		float f = 10;
		double d = f; 									// casting implicite
		double d2 = (double)f;							// casting explicite
		
		System.out.println(d + " ; " + d2);
		
		// AUTOBOXING EXEMPLE
		Integer i = 15; 								// autoboxing implicite
		Integer j = (Integer)20; 						// autoboxing explicite
		
		System.out.println(i + " ; " + j);
		
		// TRANSTYPAGE EXEMPLE
		/* Instanciation d'une classe héritée
		 * Exemple du TP-Group1-Mai
		 * Compte c = new CompteEpargne(); 				// Transtypage implicite
		 * Compte c2 = (Compte) new CompteEpargne (); 	// Transtypage explicite
		 */
	}

}
