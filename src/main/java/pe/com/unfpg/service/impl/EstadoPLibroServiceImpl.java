package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoPLibroEntity;
import pe.com.unfpg.repository.EstadoPLibroRepository;
import pe.com.unfpg.service.EstadoPLibroService
;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EstadoPLibroServiceImpl implements EstadoPLibroService
 {
	
	//inyeccion de dependencia hacia el repositorio
	private final EstadoPLibroRepository repositorio;

	EstadoPLibroServiceImpl(EstadoPLibroRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EstadoPLibroEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoPLibroEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoPLibroEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoPLibroEntity add(EstadoPLibroEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoPLibroEntity update(EstadoPLibroEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EstadoPLibroEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoPLibroEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EstadoPLibroEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoPLibroEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EstadoPLibroEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
