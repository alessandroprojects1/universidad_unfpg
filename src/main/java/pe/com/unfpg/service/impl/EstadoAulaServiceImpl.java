package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoAulaEntity;
import pe.com.unfpg.repository.EstadoAulaRepository;
import pe.com.unfpg.service.EstadoAulaService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EstadoAulaServiceImpl implements EstadoAulaService {
	
	//inyeccion de dependencia hacia el repositorio
	private final EstadoAulaRepository repositorio;

	EstadoAulaServiceImpl(EstadoAulaRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EstadoAulaEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoAulaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoAulaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoAulaEntity add(EstadoAulaEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoAulaEntity update(EstadoAulaEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EstadoAulaEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoAulaEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EstadoAulaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoAulaEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EstadoAulaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
