package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.HorarioEntity;
import pe.com.unfpg.repository.HorarioRepository;
import pe.com.unfpg.service.HorarioService;

@Service
public class HorarioServiceImpl implements HorarioService {

    private final HorarioRepository repositorio;

    HorarioServiceImpl(HorarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<HorarioEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<HorarioEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public HorarioEntity findById(Long id) { return repositorio.findById(id).get(); }

    @Override
    public HorarioEntity add(HorarioEntity obj) { return repositorio.save(obj); }

    @Override
    public HorarioEntity update(HorarioEntity obj, Long id) {
        HorarioEntity objhor = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objhor);
        return repositorio.save(objhor);
    }

    
}