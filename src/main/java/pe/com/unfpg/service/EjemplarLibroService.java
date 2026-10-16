package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.EjemplarLibroEntity;

public interface EjemplarLibroService {
	List<EjemplarLibroEntity> findAll();
	List<EjemplarLibroEntity> findAllCustom();
	EjemplarLibroEntity findById(Long id);
	EjemplarLibroEntity add(EjemplarLibroEntity obj);
	EjemplarLibroEntity update(EjemplarLibroEntity obj, Long id);
	EjemplarLibroEntity delete(Long id);
	EjemplarLibroEntity enable(Long id);
}