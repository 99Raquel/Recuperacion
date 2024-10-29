package upeu.dao;

import java.util.List;
import java.util.Optional;

import upeu.entity.Plan;

public interface PlanDao {

	Plan create(Plan a);
	Plan update(Plan a);
	void delete(Long id);
	Optional<Plan>read(Long id);
	List<Plan>readAll();
}
