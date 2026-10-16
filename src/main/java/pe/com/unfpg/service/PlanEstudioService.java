package pe.com.unfpg.service;

import java.util.List;
import pe.com.unfpg.entity.PlanEstudioEntity;

public interface PlanEstudioService {
    List<PlanEstudioEntity> findAll();
    List<PlanEstudioEntity> findAllCustom();
    PlanEstudioEntity findById(Long id);
    PlanEstudioEntity add(PlanEstudioEntity obj);
    PlanEstudioEntity update(PlanEstudioEntity obj, Long id);
    PlanEstudioEntity delete(Long id);
    PlanEstudioEntity enable(Long id);
}