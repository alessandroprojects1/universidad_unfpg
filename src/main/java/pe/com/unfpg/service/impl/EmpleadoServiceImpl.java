package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EmpleadoEntity;
import pe.com.unfpg.repository.EmpleadoRepository;
import pe.com.unfpg.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository repositorio;

    EmpleadoServiceImpl(EmpleadoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<EmpleadoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public EmpleadoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity obj) {
        obj.setEstado(true);
        return repositorio.save(obj);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity obj, Long id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objemp);
        return repositorio.save(objemp);
    }

    @Override
    public EmpleadoEntity delete(Long id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        objemp.setEstado(false);
        return repositorio.save(objemp);
    }

    @Override
    public EmpleadoEntity enable(Long id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        objemp.setEstado(true);
        return repositorio.save(objemp);
    }
}