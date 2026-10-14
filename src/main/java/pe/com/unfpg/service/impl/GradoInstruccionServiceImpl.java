package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.GradoInstruccionEntity;
import pe.com.unfpg.repository.GradoInstruccionRepository;
import pe.com.unfpg.service.GradoInstruccionService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class GradoInstruccionServiceImpl implements GradoInstruccionService {
	
	//inyeccion de dependencia hacia el repositorio
	private final GradoInstruccionRepository repositorio;

	GradoInstruccionServiceImpl(GradoInstruccionRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<GradoInstruccionEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<GradoInstruccionEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public GradoInstruccionEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public GradoInstruccionEntity add(GradoInstruccionEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public GradoInstruccionEntity update(GradoInstruccionEntity obj, Long id) {
		//buscar el valor que se va actualizar
		GradoInstruccionEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public GradoInstruccionEntity delete(Long id) {
		//buscar el valor que se va actualizar
		GradoInstruccionEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public GradoInstruccionEntity enable(Long id) {
		//buscar el valor que se va actualizar
		GradoInstruccionEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


