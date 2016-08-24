package nl.programIt.service.interfaces;

import java.util.List;
import nl.programIt.entities.Persoon;

public interface IPersoonService {
	public void AddPersoon(Persoon per);
	public void deletePersoon(Long id);
	public List<Persoon> findAllPesoon();
	
}
