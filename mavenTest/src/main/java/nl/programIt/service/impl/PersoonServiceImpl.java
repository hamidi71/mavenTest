package nl.programIt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.programIt.dao.impl.PersoonDaoImpl;
import nl.programIt.dao.interfaces.IPersoonDao;
import nl.programIt.entities.Persoon;
import nl.programIt.service.interfaces.IPersoonService;
@Service
@Transactional
public class PersoonServiceImpl implements IPersoonService {
	
	//PersoonDaoImpl per=new PersoonDaoImpl();	
	@Autowired
	private IPersoonDao persoonDao;
	@Override
	public void AddPersoon(Persoon per) {
		persoonDao.add(per);//add call persist
	}

	@Override
	public void deletePersoon(Long id) {
		persoonDao.delete(id);
	}
	@Override
	public List<Persoon> findAllPesoon() {
		List<Persoon> list=persoonDao.findAll();
		return list;
	}

}
