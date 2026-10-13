package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.RollmsEntity;
import pe.com.unfpg.repository.RollmsRepository;
import pe.com.unfpg.service.RollmsService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class RollmsServiceImpl implements RollmsService {
	
	//inyeccion de dependencia hacia el repositorio
	private final RollmsRepository repositorio;

	RollmsServiceImpl(RollmsRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<RollmsEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<RollmsEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public RollmsEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public RollmsEntity add(RollmsEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public RollmsEntity update(RollmsEntity obj, Long id) {
		//buscar el valor que se va actualizar
		RollmsEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public RollmsEntity delete(Long id) {
		//buscar el valor que se va actualizar
		RollmsEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public RollmsEntity enable(Long id) {
		//buscar el valor que se va actualizar
		RollmsEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
