package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.CursoLmsEntity;

public interface CursoLmsService {
	List<CursoLmsEntity> findAll();
	List<CursoLmsEntity> findAllCustom();
	CursoLmsEntity findById(Long id);
	CursoLmsEntity add(CursoLmsEntity obj);
	CursoLmsEntity update(CursoLmsEntity obj, Long id);
	CursoLmsEntity delete(Long id);
	CursoLmsEntity enable(Long id);
}