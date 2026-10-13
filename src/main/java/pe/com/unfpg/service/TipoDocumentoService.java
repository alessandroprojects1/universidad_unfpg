package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.TipoDocumentoEntity;
public interface TipoDocumentoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<TipoDocumentoEntity> findAll();
	//mostrar los distritos habilitados
	List<TipoDocumentoEntity> findAllCustom();
	//buscar distrito por codigo
	TipoDocumentoEntity findById(Long id);
	//registrar distrito
	TipoDocumentoEntity add(TipoDocumentoEntity obj);
	//actualizar distrito
	TipoDocumentoEntity update(TipoDocumentoEntity obj, Long id);
	//eliminar distrito
	TipoDocumentoEntity delete(Long id);
	//habilitar distrito
	TipoDocumentoEntity enable(Long id);
}
