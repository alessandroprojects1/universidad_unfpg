package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.SexoEntity;
public interface SexoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<SexoEntity> findAll();
	//mostrar los distritos habilitados
	List<SexoEntity> findAllCustom();
	//buscar distrito por codigo
	SexoEntity findById(Long id);
	//registrar distrito
	SexoEntity add(SexoEntity obj);
	//actualizar distrito
	SexoEntity update(SexoEntity obj, Long id);
	//eliminar distrito
	SexoEntity delete(Long id);
	//habilitar distrito
	SexoEntity enable(Long id);
}
