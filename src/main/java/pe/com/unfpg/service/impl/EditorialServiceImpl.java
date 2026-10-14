package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EditorialEntity;
import pe.com.unfpg.repository.EditorialRepository;
import pe.com.unfpg.service.EditorialService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class EditorialServiceImpl implements EditorialService {
	
	//inyeccion de dependencia hacia el repositorio
	private final EditorialRepository repositorio;

	EditorialServiceImpl(EditorialRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<EditorialEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<EditorialEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public EditorialEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public EditorialEntity add(EditorialEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public EditorialEntity update(EditorialEntity obj, Long id) {
		//buscar el valor que se va actualizar
		EditorialEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public EditorialEntity delete(Long id) {
		//buscar el valor que se va actualizar
		EditorialEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public EditorialEntity enable(Long id) {
		//buscar el valor que se va actualizar
		EditorialEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
