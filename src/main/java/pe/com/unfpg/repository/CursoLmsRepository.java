package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.CursoLmsEntity;

public interface CursoLmsRepository extends JpaRepository<CursoLmsEntity, Long> {

	@Query("select c from CursoLmsEntity c where c.estado=true")
	List<CursoLmsEntity> findAllCustom();
}
