package pe.com.unfpg.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.unfpg.entity.EstadoAulaEntity;
public interface EstadoAulaRepository extends JpaRepository<EstadoAulaEntity, Long> {
	//utilizamos el JpaRepository por defecto se configura:
	//mostrar, buscar por codigo, registrar, actualizar y eliminar
	
	//agregamos un Query personalizado
	//Consulta MySQL: select * from distrito where estdis=1
	//creamos un query personalizado
	@Query("select es from EstadoAulaEntity es where es.estado=true")
	List<EstadoAulaEntity> findAllCustom();
}
