package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.MatriculaLmsEntity;

public interface MatriculaLmsService {
	List<MatriculaLmsEntity> findAll();
	List<MatriculaLmsEntity> findAllCustom();
	MatriculaLmsEntity findById(Long id);
	MatriculaLmsEntity add(MatriculaLmsEntity obj);
	MatriculaLmsEntity update(MatriculaLmsEntity obj, Long id);
	MatriculaLmsEntity delete(Long id);
	MatriculaLmsEntity enable(Long id);
}