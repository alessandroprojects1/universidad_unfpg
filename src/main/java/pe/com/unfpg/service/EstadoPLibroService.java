package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EstadoPLibroEntity;
public interface EstadoPLibroService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EstadoPLibroEntity> findAll();
	//mostrar los distritos habilitados
	List<EstadoPLibroEntity> findAllCustom();
	//buscar distrito por codigo
	EstadoPLibroEntity findById(Long id);
	//registrar distrito
	EstadoPLibroEntity add(EstadoPLibroEntity obj);
	//actualizar distrito
	EstadoPLibroEntity update(EstadoPLibroEntity obj, Long id);
	//eliminar distrito
	EstadoPLibroEntity delete(Long id);
	//habilitar distrito
	EstadoPLibroEntity enable(Long id);
}


