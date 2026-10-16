package pe.com.unfpg.service;

import java.util.List;

import pe.com.unfpg.entity.UsuarioRolEntity;
import pe.com.unfpg.entity.UsuarioRolId;

public interface UsuarioRolService {
	List<UsuarioRolEntity> findAll();
	UsuarioRolEntity findById(UsuarioRolId id);
	UsuarioRolEntity add(UsuarioRolEntity obj);
	void delete(UsuarioRolId id);
}