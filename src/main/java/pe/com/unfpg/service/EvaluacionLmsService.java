package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.EvaluacionLmsEntity;

public interface EvaluacionLmsService {
	List<EvaluacionLmsEntity> findAll();
	List<EvaluacionLmsEntity> findAllCustom();
	EvaluacionLmsEntity findById(Long id);
	EvaluacionLmsEntity add(EvaluacionLmsEntity obj);
	EvaluacionLmsEntity update(EvaluacionLmsEntity obj, Long id);
	EvaluacionLmsEntity delete(Long id);
	EvaluacionLmsEntity enable(Long id);
}