package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.EvaluacionLmsEntity;
import pe.com.unfpg.repository.EvaluacionLmsRepository;
import pe.com.unfpg.service.EvaluacionLmsService;

@Service
public class EvaluacionLmsServiceImpl implements EvaluacionLmsService {

	private final EvaluacionLmsRepository repositorio;

	EvaluacionLmsServiceImpl(EvaluacionLmsRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<EvaluacionLmsEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<EvaluacionLmsEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public EvaluacionLmsEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public EvaluacionLmsEntity add(EvaluacionLmsEntity obj) {
		// valor por defecto de la BD
		if (obj.getEstado() == null) {
			obj.setEstado(true);
		}
		return repositorio.save(obj);
	}

	@Override
	public EvaluacionLmsEntity update(EvaluacionLmsEntity obj, Long id) {
		EvaluacionLmsEntity objeva = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objeva, "codigo");
		return repositorio.save(objeva);
	}

	@Override
	public EvaluacionLmsEntity delete(Long id) {
		EvaluacionLmsEntity objeva = repositorio.findById(id).get();
		objeva.setEstado(false);
		return repositorio.save(objeva);
	}

	@Override
	public EvaluacionLmsEntity enable(Long id) {
		EvaluacionLmsEntity objeva = repositorio.findById(id).get();
		objeva.setEstado(true);
		return repositorio.save(objeva);
	}
}