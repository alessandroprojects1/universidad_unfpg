package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.SexoEntity;
import pe.com.unfpg.repository.SexoRepository;
import pe.com.unfpg.service.SexoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class SexoServiceImpl implements SexoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final SexoRepository repositorio;

	SexoServiceImpl(SexoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<SexoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<SexoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public SexoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public SexoEntity add(SexoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public SexoEntity update(SexoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		SexoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public SexoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		SexoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public SexoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		SexoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


