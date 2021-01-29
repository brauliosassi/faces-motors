import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class PersistidorDeAutomoveis {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> autos = q.getResultList();
		
		
		for (Automovel a : autos){
			System.out.println(a.getMarca());
		}
	}	

}