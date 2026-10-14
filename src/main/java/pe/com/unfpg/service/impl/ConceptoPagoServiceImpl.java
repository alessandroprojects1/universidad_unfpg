package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.ConceptoPagoEntity;
import pe.com.unfpg.repository.ConceptoPagoRepository;
import pe.com.unfpg.service.ConceptoPagoService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class ConceptoPagoServiceImpl implements ConceptoPagoService {
	
	//inyeccion de dependencia hacia el repositorio
	private final ConceptoPagoRepository repositorio;

	ConceptoPagoServiceImpl(ConceptoPagoRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<ConceptoPagoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<ConceptoPagoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public ConceptoPagoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public ConceptoPagoEntity add(ConceptoPagoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public ConceptoPagoEntity update(ConceptoPagoEntity obj, Long id) {
		//buscar el valor que se va actualizar
		ConceptoPagoEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public ConceptoPagoEntity delete(Long id) {
		//buscar el valor que se va actualizar
		ConceptoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public ConceptoPagoEntity enable(Long id) {
		//buscar el valor que se va actualizar
		ConceptoPagoEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


