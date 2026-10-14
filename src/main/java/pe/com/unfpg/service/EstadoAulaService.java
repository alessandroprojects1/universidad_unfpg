package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EstadoAulaEntity;
public interface EstadoAulaService
 {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EstadoAulaEntity> findAll();
	//mostrar los distritos habilitados
	List<EstadoAulaEntity> findAllCustom();
	//buscar distrito por codigo
	EstadoAulaEntity findById(Long id);
	//registrar distrito
	EstadoAulaEntity add(EstadoAulaEntity obj);
	//actualizar distrito
	EstadoAulaEntity update(EstadoAulaEntity obj, Long id);
	//eliminar distrito
	EstadoAulaEntity delete(Long id);
	//habilitar distrito
	EstadoAulaEntity enable(Long id);
}


