package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.DocenteEntity;
public interface DocenteService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<DocenteEntity> findAll();
	//mostrar los distritos habilitados
	List<DocenteEntity> findAllCustom();
	//buscar distrito por codigo
	DocenteEntity findById(Long id);
	//registrar distrito
	DocenteEntity add(DocenteEntity obj);
	//actualizar distrito
	DocenteEntity update(DocenteEntity obj, Long id);
	//eliminar distrito
	DocenteEntity delete(Long id);
	//habilitar distrito
	DocenteEntity enable(Long id);
}


