package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.BloqueEntity;
import pe.com.unfpg.repository.BloqueRepository;
import pe.com.unfpg.service.BloqueService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class BloqueServiceImpl implements BloqueService {
	
	//inyeccion de dependencia hacia el repositorio
	private final BloqueRepository repositorio;

	BloqueServiceImpl(BloqueRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<BloqueEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<BloqueEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public BloqueEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public BloqueEntity add(BloqueEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public BloqueEntity update(BloqueEntity obj, Long id) {
		//buscar el valor que se va actualizar
		BloqueEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public BloqueEntity delete(Long id) {
		//buscar el valor que se va actualizar
		BloqueEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public BloqueEntity enable(Long id) {
		//buscar el valor que se va actualizar
		BloqueEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


