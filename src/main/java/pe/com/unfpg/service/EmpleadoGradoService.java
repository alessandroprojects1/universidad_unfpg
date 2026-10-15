package pe.com.unfpg.service;

import java.util.List;
import pe.com.unfpg.entity.EmpleadoGradoEntity;
import pe.com.unfpg.entity.EmpleadoGradoId;

public interface EmpleadoGradoService {
    List<EmpleadoGradoEntity> findAll();
    List<EmpleadoGradoEntity> findAllCustom();
    List<EmpleadoGradoEntity> findByEmpleado(Long codemp);
    EmpleadoGradoEntity findById(EmpleadoGradoId id);
    EmpleadoGradoEntity add(EmpleadoGradoEntity obj);
    EmpleadoGradoEntity update(EmpleadoGradoEntity obj, EmpleadoGradoId id);
    EmpleadoGradoEntity delete(EmpleadoGradoId id);
    EmpleadoGradoEntity enable(EmpleadoGradoId id);
}