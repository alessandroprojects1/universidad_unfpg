package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.RollmsEntity;
public interface RollmsService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<RollmsEntity> findAll();
	//mostrar los distritos habilitados
	List<RollmsEntity> findAllCustom();
	//buscar distrito por codigo
	RollmsEntity findById(Long id);
	//registrar distrito
	RollmsEntity add(RollmsEntity obj);
	//actualizar distrito
	RollmsEntity update(RollmsEntity obj, Long id);
	//eliminar distrito
	RollmsEntity delete(Long id);
	//habilitar distrito
	RollmsEntity enable(Long id);
}
