package nl.programIt.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import nl.programIt.entities.Werknemer;
//Jpa notatie
@Repository
public interface IWerknemerRepository extends JpaRepository<Werknemer, Long>{
	//dao methoden
	/*public void add(Werknemer persoon);
	public void delete(Long idPersoon);
	public Werknemer findOne(Long idPersoon);
	public void update(Werknemer p);
	public List<Werknemer> findAll();*/
	
}
