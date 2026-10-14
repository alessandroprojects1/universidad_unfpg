package pe.com.unfpg.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.unfpg.entity.GradoInstruccionEntity;
import pe.com.unfpg.service.GradoInstruccionService;
//servicio RESTful
@RestController
//definir la ruta
@RequestMapping("/api/gradoinstruccion")
public class GradoInstruccionRestController {
	//inyeccion de dependencias hacia el servicio
	@Autowired
	private GradoInstruccionService servicio;
	
	//Consultas o busquedas -> @GetMapping
	//mostrar todos los distritos
	@GetMapping
	public List<GradoInstruccionEntity> findAll(){
		return servicio.findAll();
	}
	
	//mostrar los distritos habilitados
	@GetMapping("/custom")
	public List<GradoInstruccionEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	//buscar distrito por codigo
	//{id} -> variable de ruta
	@GetMapping("/{id}")
	public GradoInstruccionEntity findById(@PathVariable Long id) {
		return servicio.findById(id);
	}
	
	//registrar -> @PostMapping
	//registrar distrito
	@PostMapping
	public GradoInstruccionEntity add(@RequestBody GradoInstruccionEntity obj) {
		return servicio.add(obj);
	}
	
	//actualizar -> @PutMapping
	//actualizar distrito
	@PutMapping("/{id}")
	public GradoInstruccionEntity update(@RequestBody GradoInstruccionEntity obj,
			@PathVariable Long id) {
		return servicio.update(obj, id);
	}
	
	//eliminar -> @DeleteMapping
	//eliminar distrito
	@DeleteMapping("/{id}")
	public GradoInstruccionEntity delete(@PathVariable Long id) {
		return servicio.delete(id);
	}
	
	//habilitar -> actualizar parcial -> @PatchMapping
	//habilitar distrito
	@PatchMapping("/{id}")
	public GradoInstruccionEntity enable(@PathVariable Long id) {
		return servicio.enable(id);
	}
}
