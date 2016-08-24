package nl.programIt.dao.interfaces;

import java.util.List;

import nl.programIt.entities.Persoon;

public interface IPersoonDao {
	public void add(Persoon persoon);
	public void delete(Long idPersoon);
	public Persoon findOne(Long idPersoon);
	public void update(Persoon p);
	public List<Persoon> findAll();
	
}
