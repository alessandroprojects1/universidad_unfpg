package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.MatriculaEntity;

public interface MatriculaService {
	List<MatriculaEntity> findAll();
	List<MatriculaEntity> findAllCustom();
	MatriculaEntity findById(Long id);
	MatriculaEntity add(MatriculaEntity obj);
	MatriculaEntity update(MatriculaEntity obj, Long id);
	MatriculaEntity delete(Long id);
	MatriculaEntity enable(Long id);
}