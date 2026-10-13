package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CargoEntity;
import pe.com.unfpg.repository.CargoRepository;
import pe.com.unfpg.service.CargoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class CargoServiceImpl implements CargoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final CargoRepository repositorio;

	CargoServiceImpl(CargoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<CargoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<CargoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public CargoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public CargoEntity add(CargoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public CargoEntity update(CargoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		CargoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public CargoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		CargoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public CargoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		CargoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


