package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.PagoEntity;
import pe.com.unfpg.repository.PagoRepository;
import pe.com.unfpg.service.PagoService;

@Service
public class PagoServiceImpl implements PagoService {

	private final PagoRepository repositorio;

	PagoServiceImpl(PagoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<PagoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<PagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public PagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PagoEntity add(PagoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public PagoEntity update(PagoEntity obj, Long id) {
		// buscar el valor que se va a actualizar
		PagoEntity objpag = repositorio.findById(id).get();
		// actualizamos los valores, sin pisar el codigo
		BeanUtils.copyProperties(obj, objpag, "codigo");
		return repositorio.save(objpag);
	}

	@Override
	public PagoEntity delete(Long id) {
		// borrado logico: cambiamos el estado
		PagoEntity objpag = repositorio.findById(id).get();
		objpag.setEstado(false);
		return repositorio.save(objpag);
	}

	@Override
	public PagoEntity enable(Long id) {
		// habilitar: cambiamos el estado
		PagoEntity objpag = repositorio.findById(id).get();
		objpag.setEstado(true);
		return repositorio.save(objpag);
	}
}