package nl.programIt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import nl.programIt.dao.interfaces.IPersoonDao;
import nl.programIt.entities.Persoon;
@Repository
public class PersoonDaoImpl implements IPersoonDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void add(Persoon persoon) {
		em.persist(persoon);

	}

	@Override
	public void delete(Long idPersoon) {
		Persoon p=em.find(Persoon.class, idPersoon);
		em.remove(p);
	}

	@Override
	public Persoon findOne(Long idPersoon) {
		Persoon p=em.find(Persoon.class, idPersoon);
		return p;
	}

	@Override
	public void update(Persoon p) {
		em.merge(p);
	}

	@Override
	public List<Persoon> findAll() {
		Query q= em.createQuery("select p from Persoon p");
		return q.getResultList();
	}

}
