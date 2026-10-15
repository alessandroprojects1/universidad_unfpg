package pe.com.unfpg.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.entity.DocenteGradoId;

public interface DocenteGradoRepository 
        extends JpaRepository<DocenteGradoEntity, DocenteGradoId> {

    @Query("select dg from DocenteGradoEntity dg")
    List<DocenteGradoEntity> findAllCustom();

    // Sobrecarga para filtrar por código de docente usando la clave compuesta (id.coddoc)
    @Query("select dg from DocenteGradoEntity dg where dg.id.coddoc = :coddoc")
    List<DocenteGradoEntity> findAllCustom(@Param("coddoc") Long coddoc);
}