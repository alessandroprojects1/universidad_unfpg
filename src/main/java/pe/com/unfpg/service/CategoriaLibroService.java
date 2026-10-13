package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.CategoriaLibroEntity;
public interface CategoriaLibroService {
	//declaramos las operaciones con las cuales vamosa trabajar
	//mostrar todos distrito
	List<CategoriaLibroEntity> findAll();
	//mostrar los distritos habilitados
	List<CategoriaLibroEntity> findAllCustom();
	//buscar distrito por codigo
	CategoriaLibroEntity findById(Long id);
	//registrar distrito
	CategoriaLibroEntity add(CategoriaLibroEntity obj);
	//actualizar distrito
	CategoriaLibroEntity update(CategoriaLibroEntity obj, Long id);
	//eliminar distrito
	CategoriaLibroEntity delete(Long id);
	//habilitar distrito
	CategoriaLibroEntity enable(Long id);
}
