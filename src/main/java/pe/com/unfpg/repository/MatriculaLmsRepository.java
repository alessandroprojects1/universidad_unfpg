package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.MatriculaLmsEntity;

public interface MatriculaLmsRepository extends JpaRepository<MatriculaLmsEntity, Long> {

	@Query("select m from MatriculaLmsEntity m where m.estado=true")
	List<MatriculaLmsEntity> findAllCustom();
}