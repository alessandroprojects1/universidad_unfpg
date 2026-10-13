package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.EstadoPagoEntity;
public interface EstadoPagoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<EstadoPagoEntity> findAll();
	//mostrar los distritos habilitados
	List<EstadoPagoEntity> findAllCustom();
	//buscar distrito por codigo
	EstadoPagoEntity findById(Long id);
	//registrar distrito
	EstadoPagoEntity add(EstadoPagoEntity obj);
	//actualizar distrito
	EstadoPagoEntity update(EstadoPagoEntity obj, Long id);
	//eliminar distrito
	EstadoPagoEntity delete(Long id);
	//habilitar distrito
	EstadoPagoEntity enable(Long id);
}
