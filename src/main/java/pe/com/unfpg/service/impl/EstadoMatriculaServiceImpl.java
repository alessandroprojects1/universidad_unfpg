package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EstadoMatriculaEntity;
import pe.com.unfpg.repository.EstadoMatriculaRepository;
import pe.com.unfpg.service.EstadoMatriculaService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EstadoMatriculaServiceImpl implements EstadoMatriculaService {
	
	//inyeccion de dependencia hacia el repositorio
	private final EstadoMatriculaRepository repositorio;

	EstadoMatriculaServiceImpl(EstadoMatriculaRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EstadoMatriculaEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EstadoMatriculaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EstadoMatriculaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EstadoMatriculaEntity add(EstadoMatriculaEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EstadoMatriculaEntity update(EstadoMatriculaEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EstadoMatriculaEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoMatriculaEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EstadoMatriculaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EstadoMatriculaEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EstadoMatriculaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


