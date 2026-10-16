package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.OrdenPagoEntity;

public interface OrdenPagoRepository extends JpaRepository<OrdenPagoEntity, Long> {

	// ordenes de pago habilitadas
	@Query("SELECT o FROM OrdenPagoEntity o WHERE o.estado = true")
	List<OrdenPagoEntity> findAllCustom();
}