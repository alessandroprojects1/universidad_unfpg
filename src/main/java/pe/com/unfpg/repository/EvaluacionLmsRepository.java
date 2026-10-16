package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.EvaluacionLmsEntity;

public interface EvaluacionLmsRepository extends JpaRepository<EvaluacionLmsEntity, Long> {

	@Query("select e from EvaluacionLmsEntity e where e.estado=true")
	List<EvaluacionLmsEntity> findAllCustom();
}