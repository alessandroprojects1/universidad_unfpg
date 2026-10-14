package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EstadoCivilEntity;
public interface EstadoCivilService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EstadoCivilEntity> findAll();
	//mostrar los distritos habilitados
	List<EstadoCivilEntity> findAllCustom();
	//buscar distrito por codigo
	EstadoCivilEntity findById(Long id);
	//registrar distrito
	EstadoCivilEntity add(EstadoCivilEntity obj);
	//actualizar distrito
	EstadoCivilEntity update(EstadoCivilEntity obj, Long id);
	//eliminar distrito
	EstadoCivilEntity delete(Long id);
	//habilitar distrito
	EstadoCivilEntity enable(Long id);
}


