package pe.com.unfpg.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.HorarioEntity;

public interface HorarioRepository extends JpaRepository<HorarioEntity, Long> {

    @Query("select h from HorarioEntity h")
    List<HorarioEntity> findAllCustom();
}