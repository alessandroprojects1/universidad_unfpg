package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.DocenteGradoEntity;
import pe.com.unfpg.entity.DocenteGradoId;
import pe.com.unfpg.repository.DocenteGradoRepository;
import pe.com.unfpg.service.DocenteGradoService;

@Service
public class DocenteGradoServiceImpl implements DocenteGradoService {

    private final DocenteGradoRepository repositorio;

    public DocenteGradoServiceImpl(DocenteGradoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<DocenteGradoEntity> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<DocenteGradoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public List<DocenteGradoEntity> findByDocente(Long coddoc) {
        return repositorio.findAllCustom(coddoc);
    }

    @Override
    public DocenteGradoEntity findById(DocenteGradoId id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public DocenteGradoEntity add(DocenteGradoEntity obj) {
        return repositorio.save(obj);
    }

    @Override
    public DocenteGradoEntity update(DocenteGradoEntity obj, DocenteGradoId id) {
        DocenteGradoEntity objdg = repositorio.findById(id).orElse(null);
        if (objdg != null) {
            BeanUtils.copyProperties(obj, objdg);
            return repositorio.save(objdg);
        }
        return null;
    }
}