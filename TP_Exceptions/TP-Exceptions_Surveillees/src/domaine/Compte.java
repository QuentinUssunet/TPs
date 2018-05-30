package domaine;
/**
 * 
 * @author Adminl
 *
 */
public class Compte {
	
	private int idCompte;
	private double solde;
	
	/**
	 * Méthode de versement dans un compte
	 * @param mt le montant a verser
	 * @throws MontantNegatifException SoldeInsuffisantException, requête des messages d'erreur 
	 */

	public void verser(double mt)throws MontantNegatifException {
		if(mt<0) throw new MontantNegatifException("VERSER UN MONTANT NEGATIF => OPERATION IMPOSSIBLE");
		solde+=mt;
	}
	
	public void retirer(double mt)throws SoldeInsuffisantException, MontantNegatifException {
		if(mt>solde) throw new SoldeInsuffisantException("SOLDE INSUFFISENT => OPERATION IMPOSSIBLE");
		if(mt<0) throw new MontantNegatifException("RETIRER UN MONTANT NEGATIF => OPERATION IMPOSSIBLE");
		solde-=mt;
	}
		
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * Methode qui récupère le solde du compte	
	 * @param getSolde retourne le solde
	 */
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
}
