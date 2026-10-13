package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoAulaEntity;
import pe.com.unfpg.repository.TipoAulaRepository;
import pe.com.unfpg.service.TipoAulaService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class TipoAulaServiceImpl implements TipoAulaService {
	
	//inyeccion de dependencia hacia el repositorio
	private final TipoAulaRepository repositorio;

	TipoAulaServiceImpl(TipoAulaRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<TipoAulaEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<TipoAulaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public TipoAulaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public TipoAulaEntity add(TipoAulaEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public TipoAulaEntity update(TipoAulaEntity obj, Long id) {
		//buscar el valor que se va actualizar
		TipoAulaEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public TipoAulaEntity delete(Long id) {
		//buscar el valor que se va actualizar
		TipoAulaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public TipoAulaEntity enable(Long id) {
		//buscar el valor que se va actualizar
		TipoAulaEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}
