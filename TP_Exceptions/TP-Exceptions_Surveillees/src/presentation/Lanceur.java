package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import domaine.Compte;
import domaine.MontantNegatifException;
import domaine.SoldeInsuffisantException;

public class Lanceur {
/**
 * Méthode main
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte cp = new Compte();
		Scanner clavier = new Scanner(System.in);

/*		try {
			System.out.println("MONTANT A VERSER : ");
			double mt = clavier.nextDouble();
			cp.verser(mt);
			System.out.print("SOLDE DU COMPTE APRES VERSEMENT : ");
			System.out.println(cp);
		} catch (MontantNegatifException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("SAISIE INCORRECTE");
		}

		try {
			System.out.println("MONTANT A RETIRER : ");
			double mt = clavier.nextDouble();
			cp.retirer(mt);
			System.out.print("SOLDE DU COMPTE APRES RETRAIT : ");
			System.out.println(cp);
		} catch (SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("SAISIE INCORRECTE");
		}
*/


		// Tout dans le meme try

		try {
			System.out.println("MONTANT A VERSER : ");
			double mt = clavier.nextDouble();
			cp.verser(mt);
			System.out.print("SOLDE DU COMPTE APRES VERSEMENT : ");
			System.out.println(cp);
			System.out.println("MONTANT A RETIRER : ");
			mt = clavier.nextDouble();
			cp.retirer(mt);			
			System.out.print("SOLDE DU COMPTE APRES RETRAIT : ");
			System.out.println(cp);
		} catch (MontantNegatifException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("SAISIE INCORRECTE");
		} catch (SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		}
		clavier.close();
	}
	
}
