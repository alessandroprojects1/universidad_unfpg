package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.SeccionEntity;
import pe.com.unfpg.repository.SeccionRepository;
import pe.com.unfpg.service.SeccionService;

@Service
public class SeccionServiceImpl implements SeccionService {

    private final SeccionRepository repositorio;

    SeccionServiceImpl(SeccionRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<SeccionEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<SeccionEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public SeccionEntity findById(Long id) { return repositorio.findById(id).get(); }

    @Override
    public SeccionEntity add(SeccionEntity obj) { return repositorio.save(obj); }

    @Override
    public SeccionEntity update(SeccionEntity obj, Long id) {
        SeccionEntity objsec = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objsec);
        return repositorio.save(objsec);
    }

   
}