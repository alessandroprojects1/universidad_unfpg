package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoCivilEntity;
import pe.com.unfpg.repository.EstadoCivilRepository;
import pe.com.unfpg.service.EstadoCivilService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EstadoCivilServiceImpl implements EstadoCivilService {
	
	//inyeccion de dependencia hacia el repositorio
	private final EstadoCivilRepository repositorio;

	EstadoCivilServiceImpl(EstadoCivilRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EstadoCivilEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoCivilEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoCivilEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoCivilEntity add(EstadoCivilEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoCivilEntity update(EstadoCivilEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EstadoCivilEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoCivilEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EstadoCivilEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoCivilEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EstadoCivilEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
