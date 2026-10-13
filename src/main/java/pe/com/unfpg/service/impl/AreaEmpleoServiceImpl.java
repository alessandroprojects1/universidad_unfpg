package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AreaEmpleoEntity;
import pe.com.unfpg.repository.AreaEmpleoRepository;
import pe.com.unfpg.service.AreaEmpleoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class AreaEmpleoServiceImpl implements AreaEmpleoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final AreaEmpleoRepository repositorio;

	AreaEmpleoServiceImpl(AreaEmpleoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<AreaEmpleoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<AreaEmpleoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public AreaEmpleoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public AreaEmpleoEntity add(AreaEmpleoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public AreaEmpleoEntity update(AreaEmpleoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		AreaEmpleoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public AreaEmpleoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		AreaEmpleoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public AreaEmpleoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		AreaEmpleoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
