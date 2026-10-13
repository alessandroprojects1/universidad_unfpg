package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.CargoEntity;
public interface CargoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<CargoEntity> findAll();
	//mostrar los distritos habilitados
	List<CargoEntity> findAllCustom();
	//buscar distrito por codigo
	CargoEntity findById(Long id);
	//registrar distrito
	CargoEntity add(CargoEntity obj);
	//actualizar distrito
	CargoEntity update(CargoEntity obj, Long id);
	//eliminar distrito
	CargoEntity delete(Long id);
	//habilitar distrito
	CargoEntity enable(Long id);
}
