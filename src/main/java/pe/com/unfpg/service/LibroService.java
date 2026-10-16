package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.LibroEntity;

public interface LibroService {

	List<LibroEntity> findAll();

	List<LibroEntity> findAllCustom();

	LibroEntity findById(Long id);

	LibroEntity add(LibroEntity obj);

	LibroEntity update(LibroEntity obj, Long id);

	LibroEntity delete(Long id);

	LibroEntity enable(Long id);
}