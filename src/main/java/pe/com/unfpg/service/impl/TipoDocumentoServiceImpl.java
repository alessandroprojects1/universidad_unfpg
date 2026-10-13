package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.TipoDocumentoEntity;
import pe.com.unfpg.repository.TipoDocumentoRepository;
import pe.com.unfpg.service.TipoDocumentoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class TipoDocumentoServiceImpl implements TipoDocumentoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final TipoDocumentoRepository repositorio;

	TipoDocumentoServiceImpl(TipoDocumentoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<TipoDocumentoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<TipoDocumentoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public TipoDocumentoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public TipoDocumentoEntity add(TipoDocumentoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public TipoDocumentoEntity update(TipoDocumentoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		TipoDocumentoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public TipoDocumentoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		TipoDocumentoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public TipoDocumentoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		TipoDocumentoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


