package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.MetodoPagoEntity;
public interface MetodoPagoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<MetodoPagoEntity> findAll();
	//mostrar los distritos habilitados
	List<MetodoPagoEntity> findAllCustom();
	//buscar distrito por codigo
	MetodoPagoEntity findById(Long id);
	//registrar distrito
	MetodoPagoEntity add(MetodoPagoEntity obj);
	//actualizar distrito
	MetodoPagoEntity update(MetodoPagoEntity obj, Long id);
	//eliminar distrito
	MetodoPagoEntity delete(Long id);
	//habilitar distrito
	MetodoPagoEntity enable(Long id);
}
