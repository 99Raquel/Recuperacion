package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan,Long>{

}
