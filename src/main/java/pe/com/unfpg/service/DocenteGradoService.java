package pe.com.unfpg.service;

import java.util.List;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.entity.DocenteGradoId;

public interface DocenteGradoService {
    List<DocenteGradoEntity> findAll();
    List<DocenteGradoEntity> findByDocente(Long coddoc);
    List<DocenteGradoEntity> findAllCustom();
    DocenteGradoEntity findById(DocenteGradoId id);
    DocenteGradoEntity add(DocenteGradoEntity obj);
    DocenteGradoEntity update(DocenteGradoEntity obj, DocenteGradoId id);
    DocenteGradoEntity delete(DocenteGradoId id);
    DocenteGradoEntity enable(DocenteGradoId id);
}