package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.MatriculaLmsEntity;
import pe.com.unfpg.repository.MatriculaLmsRepository;
import pe.com.unfpg.service.MatriculaLmsService;

@Service
public class MatriculaLmsServiceImpl implements MatriculaLmsService {

	private final MatriculaLmsRepository repositorio;

	MatriculaLmsServiceImpl(MatriculaLmsRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MatriculaLmsEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MatriculaLmsEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MatriculaLmsEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MatriculaLmsEntity add(MatriculaLmsEntity obj) {
		// valor por defecto de la BD
		if (obj.getEstado() == null) {
			obj.setEstado(true);
		}
		return repositorio.save(obj);
	}

	@Override
	public MatriculaLmsEntity update(MatriculaLmsEntity obj, Long id) {
		MatriculaLmsEntity objmat = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objmat, "codigo");
		return repositorio.save(objmat);
	}

	@Override
	public MatriculaLmsEntity delete(Long id) {
		MatriculaLmsEntity objmat = repositorio.findById(id).get();
		objmat.setEstado(false);
		return repositorio.save(objmat);
	}

	@Override
	public MatriculaLmsEntity enable(Long id) {
		MatriculaLmsEntity objmat = repositorio.findById(id).get();
		objmat.setEstado(true);
		return repositorio.save(objmat);
	}
}