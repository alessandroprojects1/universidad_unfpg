package pe.com.unfpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.unfpg.entity.LibroEntity;

public interface LibroRepository extends JpaRepository<LibroEntity, Long> {

	// libros habilitados
	@Query("SELECT l FROM LibroEntity l WHERE l.estado = true")
	List<LibroEntity> findAllCustom();
}