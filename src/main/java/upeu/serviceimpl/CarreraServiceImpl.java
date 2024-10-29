package upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.CarreraDao;
import upeu.entity.Carrera;
import upeu.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{
	
	@Autowired
	private CarreraDao dao;
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
