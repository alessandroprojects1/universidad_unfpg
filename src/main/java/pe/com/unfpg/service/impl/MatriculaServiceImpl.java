package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.MatriculaEntity;
import pe.com.unfpg.repository.MatriculaRepository;
import pe.com.unfpg.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	private final MatriculaRepository repositorio;

	MatriculaServiceImpl(MatriculaRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<MatriculaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MatriculaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MatriculaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MatriculaEntity add(MatriculaEntity obj) {
		obj.setEstado(true);
		return repositorio.save(obj);
	}

	@Override
	public MatriculaEntity update(MatriculaEntity obj, Long id) {
		MatriculaEntity objmat = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objmat, "numero", "fecha");
		return repositorio.save(objmat);
	}

	@Override
	public MatriculaEntity delete(Long id) {
		MatriculaEntity objmat = repositorio.findById(id).get();
		objmat.setEstado(false);
		return repositorio.save(objmat);
	}

	@Override
	public MatriculaEntity enable(Long id) {
		MatriculaEntity objmat = repositorio.findById(id).get();
		objmat.setEstado(true);
		return repositorio.save(objmat);
	}
}