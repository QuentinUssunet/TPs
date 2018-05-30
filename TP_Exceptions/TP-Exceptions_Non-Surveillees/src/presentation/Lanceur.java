package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanceur {

	public static int calcul(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);

		int resultat = 0;
		try {
			System.out.print("Saisir a :");
			int a = clavier.nextInt();
			System.out.print("Saisir b :");
			int b = clavier.nextInt();
			resultat = calcul(a, b);
			System.out.println("Resultat = " + resultat);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("ERREUR ATTENTION DIVISION PAR ZERO");
		} catch (InputMismatchException e2) {
			System.out.println("ERREUR ATTENTION VEUILLEZ SAISIR DES CHIFFRES");
		} finally {
			clavier.close();
		}
		
		
		

	}
}
