package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.TipoMatriculaEntity;
public interface TipoMatriculaService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<TipoMatriculaEntity> findAll();
	//mostrar los distritos habilitados
	List<TipoMatriculaEntity> findAllCustom();
	//buscar distrito por codigo
	TipoMatriculaEntity findById(Long id);
	//registrar distrito
	TipoMatriculaEntity add(TipoMatriculaEntity obj);
	//actualizar distrito
	TipoMatriculaEntity update(TipoMatriculaEntity obj, Long id);
	//eliminar distrito
	TipoMatriculaEntity delete(Long id);
	//habilitar distrito
	TipoMatriculaEntity enable(Long id);
}
