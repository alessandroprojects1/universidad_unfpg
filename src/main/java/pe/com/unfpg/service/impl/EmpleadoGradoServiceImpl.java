package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.EmpleadoGradoEntity;
import pe.com.unfpg.entity.EmpleadoGradoId;
import pe.com.unfpg.repository.EmpleadoGradoRepository;
import pe.com.unfpg.service.EmpleadoGradoService;

@Service
public class EmpleadoGradoServiceImpl implements EmpleadoGradoService {

    private final EmpleadoGradoRepository repositorio;

    public EmpleadoGradoServiceImpl(EmpleadoGradoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<EmpleadoGradoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<EmpleadoGradoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public List<EmpleadoGradoEntity> findByEmpleado(Long codemp) {
        return repositorio.findByEmpleado(codemp);
    }

    @Override
    public EmpleadoGradoEntity findById(EmpleadoGradoId id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public EmpleadoGradoEntity add(EmpleadoGradoEntity obj) {
        return repositorio.save(obj);
    }

    @Override
    public EmpleadoGradoEntity update(EmpleadoGradoEntity obj, EmpleadoGradoId id) {
        EmpleadoGradoEntity objeg = repositorio.findById(id).orElse(null);
        if (objeg != null) {
            BeanUtils.copyProperties(obj, objeg);
            return repositorio.save(objeg);
        }
        return null;
    }
}