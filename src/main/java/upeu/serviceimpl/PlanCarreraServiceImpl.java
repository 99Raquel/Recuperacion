package upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.PlanCarreraDao;
import upeu.entity.PlanCarrera;
import upeu.service.PlanCarreraService;

@Service
public class PlanCarreraServiceImpl implements PlanCarreraService{
	
	@Autowired
	private PlanCarreraDao dao;
	@Override
	public PlanCarrera create(PlanCarrera a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public PlanCarrera update(PlanCarrera a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<PlanCarrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<PlanCarrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
