package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.CategoriaLibroEntity;
import pe.com.unfpg.repository.CategoriaLibroRepository;
import pe.com.unfpg.service.CategoriaLibroService;
//indicamos que es un servicio @Service
@Service
//implementamos el servicio
public class CategoriaLibroServiceImpl implements CategoriaLibroService {
	
	//inyeccion de dependencia hacia el repositorio
	private final CategoriaLibroRepository repositorio;

	CategoriaLibroServiceImpl(CategoriaLibroRepository repositorio) {
		this.repositorio = repositorio;
	}
	@Override
	public List<CategoriaLibroEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<CategoriaLibroEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public CategoriaLibroEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public CategoriaLibroEntity add(CategoriaLibroEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public CategoriaLibroEntity update(CategoriaLibroEntity obj, Long id) {
		//buscar el valor que se va actualizar
		CategoriaLibroEntity objdis=repositorio.findById(id).get();
		//actualizamos los valores
		BeanUtils.copyProperties(obj, objdis);
		return repositorio.save(objdis);
	}
	@Override
	public CategoriaLibroEntity delete(Long id) {
		//buscar el valor que se va actualizar
		CategoriaLibroEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(false);
		return repositorio.save(objdis);
	}
	@Override
	public CategoriaLibroEntity enable(Long id) {
		//buscar el valor que se va actualizar
		CategoriaLibroEntity objdis=repositorio.findById(id).get();
		//cambiamos el estado
		objdis.setEstado(true);
		return repositorio.save(objdis);
	}
}


