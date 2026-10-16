package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.LibroEntity;
import pe.com.unfpg.repository.LibroRepository;
import pe.com.unfpg.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

	private final LibroRepository repositorio;

	LibroServiceImpl(LibroRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<LibroEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<LibroEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public LibroEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public LibroEntity add(LibroEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public LibroEntity update(LibroEntity obj, Long id) {
		// buscar el valor que se va a actualizar
		LibroEntity objlib = repositorio.findById(id).get();
		// actualizamos los valores, sin pisar el codigo
		BeanUtils.copyProperties(obj, objlib, "codigo");
		return repositorio.save(objlib);
	}

	@Override
	public LibroEntity delete(Long id) {
		// borrado logico: cambiamos el estado
		LibroEntity objlib = repositorio.findById(id).get();
		objlib.setEstado(false);
		return repositorio.save(objlib);
	}

	@Override
	public LibroEntity enable(Long id) {
		// habilitar: cambiamos el estado
		LibroEntity objlib = repositorio.findById(id).get();
		objlib.setEstado(true);
		return repositorio.save(objlib);
	}
}