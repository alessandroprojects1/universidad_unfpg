package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.CursoLmsEntity;
import pe.com.unfpg.repository.CursoLmsRepository;
import pe.com.unfpg.service.CursoLmsService;

@Service
public class CursoLmsServiceImpl implements CursoLmsService {

	private final CursoLmsRepository repositorio;

	CursoLmsServiceImpl(CursoLmsRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<CursoLmsEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<CursoLmsEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public CursoLmsEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CursoLmsEntity add(CursoLmsEntity obj) {
		// valor por defecto de la BD
		if (obj.getEstado() == null) {
			obj.setEstado(true);
		}
		return repositorio.save(obj);
	}

	@Override
	public CursoLmsEntity update(CursoLmsEntity obj, Long id) {
		CursoLmsEntity objcur = repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objcur, "codigo");
		return repositorio.save(objcur);
	}

	@Override
	public CursoLmsEntity delete(Long id) {
		CursoLmsEntity objcur = repositorio.findById(id).get();
		objcur.setEstado(false);
		return repositorio.save(objcur);
	}

	@Override
	public CursoLmsEntity enable(Long id) {
		CursoLmsEntity objcur = repositorio.findById(id).get();
		objcur.setEstado(true);
		return repositorio.save(objcur);
	}
}