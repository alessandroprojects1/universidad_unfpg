package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EstadoMatriculaEntity;

public interface EstadoMatriculaService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EstadoMatriculaEntity> findAll();
	//mostrar los distritos habilitados
	List<EstadoMatriculaEntity> findAllCustom();
	//buscar distrito por codigo
	EstadoMatriculaEntity findById(Long id);
	//registrar distrito
	EstadoMatriculaEntity add(EstadoMatriculaEntity obj);
	//actualizar distrito
	EstadoMatriculaEntity update(EstadoMatriculaEntity obj, Long id);
	//eliminar distrito
	EstadoMatriculaEntity delete(Long id);
	//habilitar distrito
	EstadoMatriculaEntity enable(Long id);
}
