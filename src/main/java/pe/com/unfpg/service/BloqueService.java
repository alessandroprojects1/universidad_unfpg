package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.BloqueEntity;
public interface BloqueService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<BloqueEntity> findAll();
	//mostrar los distritos habilitados
	List<BloqueEntity> findAllCustom();
	//buscar distrito por codigo
	BloqueEntity findById(Long id);
	//registrar distrito
	BloqueEntity add(BloqueEntity obj);
	//actualizar distrito
	BloqueEntity update(BloqueEntity obj, Long id);
	//eliminar distrito
	BloqueEntity delete(Long id);
	//habilitar distrito
	BloqueEntity enable(Long id);
}
