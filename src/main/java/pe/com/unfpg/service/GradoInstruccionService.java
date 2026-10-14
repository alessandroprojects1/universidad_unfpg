package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.GradoInstruccionEntity;
public interface GradoInstruccionService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<GradoInstruccionEntity> findAll();
	//mostrar los distritos habilitados
	List<GradoInstruccionEntity> findAllCustom();
	//buscar distrito por codigo
	GradoInstruccionEntity findById(Long id);
	//registrar distrito
	GradoInstruccionEntity add(GradoInstruccionEntity obj);
	//actualizar distrito
	GradoInstruccionEntity update(GradoInstruccionEntity obj, Long id);
	//eliminar distrito
	GradoInstruccionEntity delete(Long id);
	//habilitar distrito
	GradoInstruccionEntity enable(Long id);
}
