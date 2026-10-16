package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.TrasladoEntity;

public interface TrasladoRepository extends JpaRepository<TrasladoEntity, Long> {

	// traslados habilitados
	@Query("SELECT t FROM TrasladoEntity t WHERE t.estado = true")
	List<TrasladoEntity> findAllCustom();
}