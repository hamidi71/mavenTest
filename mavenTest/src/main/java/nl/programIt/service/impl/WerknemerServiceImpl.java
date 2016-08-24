package nl.programIt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import nl.programIt.entities.Werknemer;
import nl.programIt.repository.interfaces.IWerknemerRepository;
import nl.programIt.service.interfaces.IWerknemerService;
@Service
@Transactional
public class WerknemerServiceImpl implements IWerknemerService {
			
	@Autowired
	private IWerknemerRepository werknemerRep;

	@Override
	public void AddWerknemer(Werknemer per) {
		werknemerRep.save(per);
		
	}

	@Override
	public void deleteWerknemer(Long id) {
		werknemerRep.delete(id);
		
	}

	@Override
	public List<Werknemer> findAllWerknemers() {
		//werknemerRep.findAll();
		//return findAllWerknemers(); foooot
		List<Werknemer> list=werknemerRep.findAll();
		return list;
		
	}

	@Override
	public void updateWerknemer(Werknemer werknemer) {
		werknemerRep.saveAndFlush(werknemer);
		
	}
	

}
