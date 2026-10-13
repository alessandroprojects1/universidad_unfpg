package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.RolEntity;
import pe.com.unfpg.repository.RolRepository;
import pe.com.unfpg.service.RolService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class RolServiceImpl implements RolService {
	
	//inyeccion de dependencia hacia el repositorio
	private final RolRepository repositorio;

	RolServiceImpl(RolRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<RolEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<RolEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public RolEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public RolEntity add(RolEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public RolEntity update(RolEntity obj, Long id) {
		//buscar el valor que se va actualizar
		RolEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public RolEntity delete(Long id) {
		//buscar el valor que se va actualizar
		RolEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public RolEntity enable(Long id) {
		//buscar el valor que se va actualizar
		RolEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


