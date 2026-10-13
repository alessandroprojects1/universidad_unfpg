package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DiaSemanaEntity;
import pe.com.unfpg.repository.DiaSemanaRepository;
import pe.com.unfpg.service.DiaSemanaService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class DiaSemanaServiceImpl implements DiaSemanaService {
	
	//inyeccion de dependencia hacia el repositorio
	private final DiaSemanaRepository repositorio;

	DiaSemanaServiceImpl(DiaSemanaRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<DiaSemanaEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<DiaSemanaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public DiaSemanaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public DiaSemanaEntity add(DiaSemanaEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public DiaSemanaEntity update(DiaSemanaEntity obj, Long id) {
		//buscar el valor que se va actualizar
		DiaSemanaEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public DiaSemanaEntity delete(Long id) {
		//buscar el valor que se va actualizar
		DiaSemanaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public DiaSemanaEntity enable(Long id) {
		//buscar el valor que se va actualizar
		DiaSemanaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


