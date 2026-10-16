package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.PrestamoLibroEntity;

public interface PrestamoLibroRepository extends JpaRepository<PrestamoLibroEntity, Long> {

	@Query("select p from PrestamoLibroEntity p where p.estado=true")
	List<PrestamoLibroEntity> findAllCustom();
}