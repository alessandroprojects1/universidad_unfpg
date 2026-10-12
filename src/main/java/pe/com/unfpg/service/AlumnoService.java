

package pe.com.unfpg.service;
import java.util.List;
import pe.com.unfpg.entity.AlumnoEntity;
public interface AlumnoService 

{
	List<AlumnoEntity> findAll();
	List<AlumnoEntity> findAllCustom();
	AlumnoEntity findById(Long id);
	AlumnoEntity add(AlumnoEntity obj);
	AlumnoEntity update(AlumnoEntity obj, Long id);
	AlumnoEntity delete(Long id);
	AlumnoEntity enable(Long id);
}

