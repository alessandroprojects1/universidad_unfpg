package pe.com.unfpg.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.entity.DocenteGradoId;

public interface DocenteGradoRepository 
        extends JpaRepository<DocenteGradoEntity, DocenteGradoId> {

    @Query("select dg from DocenteGradoEntity dg where dg.docente.codigo = :coddoc")
    List<DocenteGradoEntity> findByDocente(@Param("coddoc") Long coddoc);
}