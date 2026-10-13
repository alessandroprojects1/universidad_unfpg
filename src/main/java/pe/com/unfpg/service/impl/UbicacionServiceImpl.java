package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.UbicacionEntity;
import pe.com.unfpg.repository.UbicacionRepository;
import pe.com.unfpg.service.UbicacionService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class UbicacionServiceImpl implements UbicacionService {
	
	//inyeccion de dependencia hacia el repositorio
	private final UbicacionRepository repositorio;

	UbicacionServiceImpl(UbicacionRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<UbicacionEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<UbicacionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public UbicacionEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public UbicacionEntity add(UbicacionEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public UbicacionEntity update(UbicacionEntity obj, Long id) {
		//buscar el valor que se va actualizar
		UbicacionEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public UbicacionEntity delete(Long id) {
		//buscar el valor que se va actualizar
		UbicacionEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public UbicacionEntity enable(Long id) {
		//buscar el valor que se va actualizar
		UbicacionEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}



