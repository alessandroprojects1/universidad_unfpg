package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.OrdenPagoEntity;
import pe.com.unfpg.repository.OrdenPagoRepository;
import pe.com.unfpg.service.OrdenPagoService;

@Service
public class OrdenPagoServiceImpl implements OrdenPagoService {

	private final OrdenPagoRepository repositorio;

	OrdenPagoServiceImpl(OrdenPagoRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<OrdenPagoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<OrdenPagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public OrdenPagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public OrdenPagoEntity add(OrdenPagoEntity obj) {
		return repositorio.save(obj);
	}

	@Override
	public OrdenPagoEntity update(OrdenPagoEntity obj, Long id) {
		// buscar el valor que se va a actualizar
		OrdenPagoEntity objord = repositorio.findById(id).get();
		// actualizamos los valores, sin pisar el codigo
		BeanUtils.copyProperties(obj, objord, "codigo");
		return repositorio.save(objord);
	}

	@Override
	public OrdenPagoEntity delete(Long id) {
		// borrado logico: cambiamos el estado
		OrdenPagoEntity objord = repositorio.findById(id).get();
		objord.setEstado(false);
		return repositorio.save(objord);
	}

	@Override
	public OrdenPagoEntity enable(Long id) {
		// habilitar: cambiamos el estado
		OrdenPagoEntity objord = repositorio.findById(id).get();
		objord.setEstado(true);
		return repositorio.save(objord);
	}
}