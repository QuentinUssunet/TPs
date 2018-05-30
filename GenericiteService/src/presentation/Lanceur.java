package presentation;

import domaine.Login;
import domaine.Personne;
import service.LoginImpl;
import service.PersonneImpl;

public class Lanceur {

	public static void main(String[] args) {

		Personne p = new Personne(1,"quentin","ussunet",27);
		PersonneImpl pi = new PersonneImpl();
		
		pi.ajouter(p);
		
		pi.afficher(pi.findAll());
		
		Login l = new Login(1,"pseudo","mdp");
		LoginImpl li = new LoginImpl();
		
		li.ajouter(l);
		
		li.afficher(li.findAll());
		

	}

}
