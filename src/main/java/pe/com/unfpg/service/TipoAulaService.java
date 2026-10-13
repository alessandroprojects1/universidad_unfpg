package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.TipoAulaEntity;

public interface TipoAulaService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<TipoAulaEntity> findAll();
	//mostrar los distritos habilitados
	List<TipoAulaEntity> findAllCustom();
	//buscar distrito por codigo
	TipoAulaEntity findById(Long id);
	//registrar distrito
	TipoAulaEntity add(TipoAulaEntity obj);
	//actualizar distrito
	TipoAulaEntity update(TipoAulaEntity obj, Long id);
	//eliminar distrito
	TipoAulaEntity delete(Long id);
	//habilitar distrito
	TipoAulaEntity enable(Long id);
}
