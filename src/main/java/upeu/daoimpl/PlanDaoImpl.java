package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.PlanDao;
import upeu.entity.Plan;
import upeu.repository.PlanRepository;

@Component
public class PlanDaoImpl implements PlanDao{
	
	@Autowired
	private PlanRepository repository;
	@Override
	public Plan create(Plan a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Plan update(Plan a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return  repository.findById(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
