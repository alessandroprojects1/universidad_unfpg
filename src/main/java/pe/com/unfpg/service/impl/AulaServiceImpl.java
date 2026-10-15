package pe.com.unfpg.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import pe.com.unfpg.entity.AulaEntity;
import pe.com.unfpg.entity.EstadoAulaEntity;
import pe.com.unfpg.repository.AulaRepository;
import pe.com.unfpg.repository.EstadoAulaRepository;
import pe.com.unfpg.service.AulaService;

@Service
public class AulaServiceImpl implements AulaService {

    private final AulaRepository repositorio;
    private final EstadoAulaRepository estadoAulaRepositorio;

    AulaServiceImpl(AulaRepository repositorio,
                    EstadoAulaRepository estadoAulaRepositorio) {
        this.repositorio = repositorio;
        this.estadoAulaRepositorio = estadoAulaRepositorio;
    }

    @Override
    public List<AulaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<AulaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public AulaEntity findById(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public AulaEntity add(AulaEntity obj) {
        return repositorio.save(obj);
    }

    @Override
    public AulaEntity update(AulaEntity obj, Long id) {
        AulaEntity objaula = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objaula);
        return repositorio.save(objaula);
    }

    @Override
    public AulaEntity delete(Long id) {
        // Asume que el estado "MANTENIMIENTO" tiene codesta=3
        // Ajusta el id según tus datos en estadoaula
        AulaEntity objaula = repositorio.findById(id).get();
        EstadoAulaEntity estado = estadoAulaRepositorio.findById(3L).get();
        objaula.setEstadoaula(estado);
        return repositorio.save(objaula);
    }

    @Override
    public AulaEntity enable(Long id) {
        // Asume que el estado "DISPONIBLE" tiene codesta=1
        // Ajusta el id según tus datos en estadoaula
        AulaEntity objaula = repositorio.findById(id).get();
        EstadoAulaEntity estado = estadoAulaRepositorio.findById(1L).get();
        objaula.setEstadoaula(estado);
        return repositorio.save(objaula);
    }
}