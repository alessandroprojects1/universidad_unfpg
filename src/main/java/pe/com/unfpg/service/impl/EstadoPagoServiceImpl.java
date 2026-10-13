package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoPagoEntity;
import pe.com.unfpg.repository.EstadoPagoRepository;
import pe.com.unfpg.service.EstadoPagoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EstadoPagoServiceImpl implements EstadoPagoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final EstadoPagoRepository repositorio;

	EstadoPagoServiceImpl(EstadoPagoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EstadoPagoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoPagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoPagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoPagoEntity add(EstadoPagoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoPagoEntity update(EstadoPagoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EstadoPagoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoPagoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EstadoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoPagoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EstadoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


