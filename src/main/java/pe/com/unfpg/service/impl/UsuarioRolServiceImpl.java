package pe.com.unfpg.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.unfpg.entity.UsuarioRolEntity;
import pe.com.unfpg.entity.UsuarioRolId;
import pe.com.unfpg.repository.UsuarioRolRepository;
import pe.com.unfpg.service.UsuarioRolService;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService {

	private final UsuarioRolRepository repositorio;

	UsuarioRolServiceImpl(UsuarioRolRepository repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public List<UsuarioRolEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public UsuarioRolEntity findById(UsuarioRolId id) {
		return repositorio.findById(id).get();
	}

	@Override
	public UsuarioRolEntity add(UsuarioRolEntity obj) {
		if (obj.getUsuario() == null || obj.getRol() == null) {
			throw new IllegalArgumentException("Debe indicar el usuario y el rol");
		}
		// se arma la clave compuesta a partir de las dos FK
		UsuarioRolId id = new UsuarioRolId(obj.getUsuario().getCodigo(), obj.getRol().getCodigo());
		if (repositorio.existsById(id)) {
			throw new IllegalArgumentException("El usuario ya tiene asignado ese rol");
		}
		obj.setId(id);
		return repositorio.save(obj);
	}

	@Override
	public void delete(UsuarioRolId id) {
		repositorio.deleteById(id);
	}
}