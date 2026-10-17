package pe.com.unfpg.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DocenteEntity;
import pe.com.unfpg.repository.DocenteRepository;
import pe.com.unfpg.service.DocenteService;
@Service
public class DocenteServiceImpl implements DocenteService {
	private final DocenteRepository repositorio;

	DocenteServiceImpl(DocenteRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@Override
	public List<DocenteEntity> findAll() {
		return repositorio.findAll();
	}
	@Override
	public List<DocenteEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}
	@Override
	public DocenteEntity findById(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public DocenteEntity add(DocenteEntity obj) {
		return repositorio.save(obj);
	}
	@Override
	public DocenteEntity update(DocenteEntity obj, Long id) {
		DocenteEntity objalu=repositorio.findById(id).get();
		BeanUtils.copyProperties(obj, objalu);
		return repositorio.save(objalu);
	}
	@Override
	public DocenteEntity delete(Long id) {
		DocenteEntity objalu=repositorio.findById(id).get();
		objalu.setEstado(false);
		return repositorio.save(objalu);
	}
	@Override
	public DocenteEntity enable(Long id) {
		DocenteEntity objalu=repositorio.findById(id).get();
		objalu.setEstado(true);
		return repositorio.save(objalu);
	}
}


