package upeu.service;

import java.util.List;
import java.util.Optional;

import upeu.entity.Plan;

public interface PlanService {
	Plan create(Plan a);
	Plan update(Plan a);
	void delete(Long id);
	Optional<Plan>read(Long id);
	List<Plan>readAll();
}
