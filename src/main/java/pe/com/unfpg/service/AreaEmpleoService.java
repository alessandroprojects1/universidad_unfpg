package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.AreaEmpleoEntity;

public interface AreaEmpleoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<AreaEmpleoEntity> findAll();
	//mostrar los distritos habilitados
	List<AreaEmpleoEntity> findAllCustom();
	//buscar distrito por codigo
	AreaEmpleoEntity findById(Long id);
	//registrar distrito
	AreaEmpleoEntity add(AreaEmpleoEntity obj);
	//actualizar distrito
	AreaEmpleoEntity update(AreaEmpleoEntity obj, Long id);
	//eliminar distrito
	AreaEmpleoEntity delete(Long id);
	//habilitar distrito
	AreaEmpleoEntity enable(Long id);
}
