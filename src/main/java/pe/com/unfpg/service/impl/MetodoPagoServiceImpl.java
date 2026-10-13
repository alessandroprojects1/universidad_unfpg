package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.MetodoPagoEntity;
import pe.com.unfpg.repository.MetodoPagoRepository;
import pe.com.unfpg.service.MetodoPagoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class MetodoPagoServiceImpl implements MetodoPagoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final MetodoPagoRepository repositorio;

	MetodoPagoServiceImpl(MetodoPagoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<MetodoPagoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<MetodoPagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public MetodoPagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public MetodoPagoEntity add(MetodoPagoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public MetodoPagoEntity update(MetodoPagoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		MetodoPagoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public MetodoPagoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		MetodoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public MetodoPagoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		MetodoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


