package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AlumnoEntity;
import pe.com.unfpg.repository.AlumnoRepository;
import pe.com.unfpg.service.AlumnoService;
@Service
public class AlumnoServiceImpl implements AlumnoService {
	private final AlumnoRepository repositorio;

	AlumnoServiceImpl(AlumnoRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List<AlumnoEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<AlumnoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public AlumnoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public AlumnoEntity add(AlumnoEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public AlumnoEntity update(AlumnoEntity obj, Long id) {
		AlumnoEntity objalu=repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objalu);
		return repositorio.save(objalu);
	}
	@Override
	public AlumnoEntity delete(Long id) {
		AlumnoEntity objalu=repositorio.findById(id).get();
		objalu.setEstado(false);
		return repositorio.save(objalu);
	}
	@Override
	public AlumnoEntity enable(Long id) {
		AlumnoEntity objalu=repositorio.findById(id).get();
		objalu.setEstado(true);
		return repositorio.save(objalu);
	}
}


