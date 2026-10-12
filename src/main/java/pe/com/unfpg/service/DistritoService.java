package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.DistritoEntity;
public interface DistritoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<DistritoEntity> findAll();
	//mostrar los distritos habilitados
	List<DistritoEntity> findAllCustom();
	//buscar distrito por codigo
	DistritoEntity findById(Long id);
	//registrar distrito
	DistritoEntity add(DistritoEntity obj);
	//actualizar distrito
	DistritoEntity update(DistritoEntity obj, Long id);
	//eliminar distrito
	DistritoEntity delete(Long id);
	//habilitar distrito
	DistritoEntity enable(Long id);
}


