package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.UbicacionEntity;
public interface UbicacionService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<UbicacionEntity> findAll();
	//mostrar los distritos habilitados
	List<UbicacionEntity> findAllCustom();
	//buscar distrito por codigo
	UbicacionEntity findById(Long id);
	//registrar distrito
	UbicacionEntity add(UbicacionEntity obj);
	//actualizar distrito
	UbicacionEntity update(UbicacionEntity obj, Long id);
	//eliminar distrito
	UbicacionEntity delete(Long id);
	//habilitar distrito
	UbicacionEntity enable(Long id);
}
