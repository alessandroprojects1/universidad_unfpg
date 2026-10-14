package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EditorialEntity;
public interface EditorialService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EditorialEntity> findAll();
	//mostrar los distritos habilitados
	List<EditorialEntity> findAllCustom();
	//buscar distrito por codigo
	EditorialEntity findById(Long id);
	//registrar distrito
	EditorialEntity add(EditorialEntity obj);
	//actualizar distrito
	EditorialEntity update(EditorialEntity obj, Long id);
	//eliminar distrito
	EditorialEntity delete(Long id);
	//habilitar distrito
	EditorialEntity enable(Long id);
}


