package nl.programIt.service.interfaces;

import java.util.List;
import nl.programIt.entities.Werknemer;

public interface IWerknemerService {
	public void AddWerknemer(Werknemer per);
	public void deleteWerknemer(Long id);
	public List<Werknemer> findAllWerknemers();
	public void updateWerknemer(Werknemer werknemer);
	
}
