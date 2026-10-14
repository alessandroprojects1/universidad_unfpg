package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.ConceptoPagoEntity;
public interface ConceptoPagoService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<ConceptoPagoEntity> findAll();
	//mostrar los distritos habilitados
	List<ConceptoPagoEntity> findAllCustom();
	//buscar distrito por codigo
	ConceptoPagoEntity findById(Long id);
	//registrar distrito
	ConceptoPagoEntity add(ConceptoPagoEntity obj);
	//actualizar distrito
	ConceptoPagoEntity update(ConceptoPagoEntity obj, Long id);
	//eliminar distrito
	ConceptoPagoEntity delete(Long id);
	//habilitar distrito
	ConceptoPagoEntity enable(Long id);
}
