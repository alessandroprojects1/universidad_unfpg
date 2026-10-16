package pe.com.unfpg.service;

import java.util.List;
import pe.com.unfpg.entity.CursoEntity;

public interface CursoService {
    List<CursoEntity> findAll();
    List<CursoEntity> findAllCustom();
    CursoEntity findById(Long id);
    CursoEntity add(CursoEntity obj);
    CursoEntity update(CursoEntity obj, Long id);
}