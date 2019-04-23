package msprNivantis.modele;

import java.util.List;

import javax.persistence.EntityManager;

public class ProduitDao {

	private EntityManager em;
	
	public ProduitDao(EntityManager em) {
		
		this.em = em;
	}
	
	public List<Produit> get(){
		
		return em.createQuery("select p from Produit p", Produit.class)
				.getResultList();
	}
	
	
}
