package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoMatriculaEntity;
import pe.com.unfpg.repository.TipoMatriculaRepository;
import pe.com.unfpg.service.TipoMatriculaService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class TipoMatriculaServiceImpl implements TipoMatriculaService {
	
	//inyeccion de dependencia hacia el repositorio
	private final TipoMatriculaRepository repositorio;

	TipoMatriculaServiceImpl(TipoMatriculaRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<TipoMatriculaEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<TipoMatriculaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public TipoMatriculaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public TipoMatriculaEntity add(TipoMatriculaEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public TipoMatriculaEntity update(TipoMatriculaEntity obj, Long id) {
		//buscar el valor que se va actualizar
		TipoMatriculaEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public TipoMatriculaEntity delete(Long id) {
		//buscar el valor que se va actualizar
		TipoMatriculaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public TipoMatriculaEntity enable(Long id) {
		//buscar el valor que se va actualizar
		TipoMatriculaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
