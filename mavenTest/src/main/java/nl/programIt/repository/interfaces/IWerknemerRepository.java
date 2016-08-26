//Interface Implement Repositor in plaats van Dao (Interface en Class)
package nl.programIt.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import nl.programIt.entities.Werknemer;
//Jpa notatie
@Repository
public interface IWerknemerRepository extends JpaRepository<Werknemer, Long>{
	
	//1-select e from  Werknemer e where e.email=usrename and e.password=password
	//methode toevoegen waneer u hem nodig hebt
	public Werknemer findByEmailAndWachtwoord(String username,String password);
	//2-query
	@Query("select s from  Werknemer s where s.email=:u and s.password=:pwd")
	public Werknemer auth(@Param("u") String username,@Param("pwd") String password);
	
	//dao.interfaces methoden
	/*public void add(Werknemer persoon);
	public void delete(Long idPersoon);
	public Werknemer findOne(Long idPersoon);
	public void update(Werknemer p);
	public List<Werknemer> findAll();*/
	
	
}
