/**
 * 
 */
package presentation;

import java.util.Scanner;

/**
 * @author Adminl
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// afficher le menu
		System.out.println("----------MENU---------");
		System.out.println("TAPER 1 pour Gérer les Comptes");
		System.out.println("TAPER 2 pour Gérer les Personnes");
		System.out.println("TAPER 0 pour Sortir");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		
		while (choix != 0) {
			if (choix == 1) {
				System.out.println("GESTION DES COMPTES");
				System.out.println("Taper 1 pour ajouter des Comptes");
				System.out.println("Taper 2 pour modifier des Comptes");
				System.out.println("Taper 3 pour lister des Comptes");
				System.out.println("Taper 4 pour supprimer des Comptes");
				System.out.println("Taper 0 pour revenir au menu précédent");
				int choix2 = sc.nextInt();
				while (choix2 !=0 ) {
					if(choix2 == 1) {
						System.out.println("Ajouter des Comptes");
					}
					else if(choix2 == 2) {
						System.out.println("Modifier des Comptes");
					}
					else if(choix2 == 3) {
						System.out.println("Lister des Comptes");
					}
					else if(choix2 == 4) {
						System.out.println("Supprimer des Comptes");
					}
					else if(choix2 == 0) {
						System.out.println("Supprimer des Comptes");
					}
				}
			} else if (choix == 2) {
				System.out.println("GESTION DES PERSONNES");
				choix = sc.nextInt();
			} else {
				System.out.println("MAUVAIS CHOIX, MERCI DE RESSAISIR");
				System.out.println("TAPER 1 pour Gérer les Comptes");
				System.out.println("TAPER 2 pour Gérer les Personnes");
				System.out.println("TAPER 0 pour Sortir");
				choix = sc.nextInt();
			}

		}
		System.out.println("AU REVOIR ...");
	}
}
