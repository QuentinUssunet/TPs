/**
 * 
 */
package service;

import java.util.List;

/**
 * @author Adminl
 *
 */
public interface IGeneriqueService<T> {
	public void ajouter(T t);
	public void supprimer(T t);
	public List<T> findAll();
	public abstract void modifier(T t);
	public T rechercher(Integer id);
	public void afficher(List<T> liste);
	

}
