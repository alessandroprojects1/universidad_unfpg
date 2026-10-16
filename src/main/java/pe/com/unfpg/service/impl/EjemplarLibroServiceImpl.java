package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.EjemplarLibroEntity;
import pe.com.unfpg.repository.EjemplarLibroRepository;
import pe.com.unfpg.service.EjemplarLibroService;

@Service
public class EjemplarLibroServiceImpl implements EjemplarLibroService {

	private final EjemplarLibroRepository repositorio;

	EjemplarLibroServiceImpl(EjemplarLibroRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<EjemplarLibroEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<EjemplarLibroEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public EjemplarLibroEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public EjemplarLibroEntity add(EjemplarLibroEntity obj) {
		// valores por defecto de la BD
		if (obj.getEstadoejemplar() == null) {
			obj.setEstadoejemplar("DISPONIBLE");
		}
		if (obj.getEstado() == null) {
			obj.setEstado(true);
		}
		return repositorio.save(obj);
	}

	@Override
	public EjemplarLibroEntity update(EjemplarLibroEntity obj, Long id) {
		EjemplarLibroEntity objeje = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objeje, "codigo");
		return repositorio.save(objeje);
	}

	@Override
	public EjemplarLibroEntity delete(Long id) {
		EjemplarLibroEntity objeje = repositorio.findById(id).get();
		objeje.setEstado(false);
		return repositorio.save(objeje);
	}

	@Override
	public EjemplarLibroEntity enable(Long id) {
		EjemplarLibroEntity objeje = repositorio.findById(id).get();
		objeje.setEstado(true);
		return repositorio.save(objeje);
	}
}
