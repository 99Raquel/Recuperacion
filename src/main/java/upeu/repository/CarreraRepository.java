package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera,Long>{

}
