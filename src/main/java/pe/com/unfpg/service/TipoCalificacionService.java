package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.TipoCalificacionEntity;
public interface TipoCalificacionService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<TipoCalificacionEntity> findAll();
	//mostrar los distritos habilitados
	List<TipoCalificacionEntity> findAllCustom();
	//buscar distrito por codigo
	TipoCalificacionEntity findById(Long id);
	//registrar distrito
	TipoCalificacionEntity add(TipoCalificacionEntity obj);
	//actualizar distrito
	TipoCalificacionEntity update(TipoCalificacionEntity obj, Long id);
	//eliminar distrito
	TipoCalificacionEntity delete(Long id);
	//habilitar distrito
	TipoCalificacionEntity enable(Long id);
}
