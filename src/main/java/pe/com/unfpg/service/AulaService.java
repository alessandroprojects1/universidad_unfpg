package pe.com.unfpg.service;

import java.util.List;
import pe.com.unfpg.entity.AulaEntity;

public interface AulaService {
    List<AulaEntity> findAll();
    List<AulaEntity> findAllCustom();
    AulaEntity findById(Long id);
    AulaEntity add(AulaEntity obj);
    AulaEntity update(AulaEntity obj, Long id);
    AulaEntity delete(Long id);
    AulaEntity enable(Long id);
}