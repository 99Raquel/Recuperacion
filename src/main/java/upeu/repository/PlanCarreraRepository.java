package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.PlanCarrera;

@Repository
public interface PlanCarreraRepository extends JpaRepository<PlanCarrera,Long>{

}
