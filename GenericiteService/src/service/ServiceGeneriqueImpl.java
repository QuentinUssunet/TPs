package service;

import java.util.List;
import java.util.Vector;

public abstract class ServiceGeneriqueImpl<T> implements IGeneriqueService<T> {

	private List<T> listeT= new Vector<T>();
	@Override
	public void ajouter(T t) {
		// TODO Auto-generated method stub
		listeT.add(t);
	}

	@Override
	public void supprimer(T t) {
		// TODO Auto-generated method stub
		listeT.remove(t);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return listeT;
	}

	@Override
	public void modifier(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T rechercher(Integer id) {
		// TODO Auto-generated method stub
		return listeT.get(id);
	}

	@Override
	public void afficher(List<T> listeT) {

		for (T t : listeT) {
			System.out.println(t);
		}
		
	



	}
	

}
