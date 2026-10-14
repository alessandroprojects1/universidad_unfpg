package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoCalificacionEntity;
import pe.com.unfpg.repository.TipoCalificacionRepository;
import pe.com.unfpg.service.TipoCalificacionService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class TipoCalificacionServiceImpl implements TipoCalificacionService {
	
	//inyeccion de dependencia hacia el repositorio
	private final TipoCalificacionRepository repositorio;

	TipoCalificacionServiceImpl(TipoCalificacionRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<TipoCalificacionEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<TipoCalificacionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public TipoCalificacionEntity
 findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public TipoCalificacionEntity
 add(TipoCalificacionEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public TipoCalificacionEntity
 update(TipoCalificacionEntity
 obj, Long id) {
		//buscar el valor que se va actualizar
		TipoCalificacionEntity
 objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public TipoCalificacionEntity
 delete(Long id) {
		//buscar el valor que se va actualizar
		TipoCalificacionEntity
 objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public TipoCalificacionEntity
 enable(Long id) {
		//buscar el valor que se va actualizar
		TipoCalificacionEntity
 objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


