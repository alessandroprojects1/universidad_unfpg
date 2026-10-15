package pe.com.unfpg.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.AulaEntity;

public interface AulaRepository extends JpaRepository<AulaEntity, Long> {

    // Trae aulas con estadoaula id=1 (DISPONIBLE)
    @Query("select a from AulaEntity a where a.estadoaula.codigo = 1")
    List<AulaEntity> findAllCustom();
}