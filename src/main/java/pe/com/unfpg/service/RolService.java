package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.RolEntity;
public interface RolService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<RolEntity> findAll();
	//mostrar los distritos habilitados
	List<RolEntity> findAllCustom();
	//buscar distrito por codigo
	RolEntity findById(Long id);
	//registrar distrito
	RolEntity add(RolEntity obj);
	//actualizar distrito
	RolEntity update(RolEntity obj, Long id);
	//eliminar distrito
	RolEntity delete(Long id);
	//habilitar distrito
	RolEntity enable(Long id);
}
