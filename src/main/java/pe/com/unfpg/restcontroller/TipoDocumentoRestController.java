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
import pe.com.unfpg.entity.TipoDocumentoEntity;
import pe.com.unfpg.service.TipoDocumentoService;
//servicio RESTful
@RestController
//definir la ruta
@RequestMapping("/api/tipodocumento")
public class TipoDocumentoRestController {
	//inyeccion de dependencias hacia el servicio
	@Autowired
	private TipoDocumentoService servicio;
	
	//Consultas o busquedas -> @GetMapping
	//mostrar todos los distritos
	@GetMapping
	public List<TipoDocumentoEntity> findAll(){
		return servicio.findAll();
	}
	
	//mostrar los distritos habilitados
	@GetMapping("/custom")
	public List<TipoDocumentoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	//buscar distrito por codigo
	//{id} -> variable de ruta
	@GetMapping("/{id}")
	public TipoDocumentoEntity findById(@PathVariable Long id) {
		return servicio.findById(id);
	}
	
	//registrar -> @PostMapping
	//registrar distrito
	@PostMapping
	public TipoDocumentoEntity add(@RequestBody TipoDocumentoEntity obj) {
		return servicio.add(obj);
	}
	
	//actualizar -> @PutMapping
	//actualizar distrito
	@PutMapping("/{id}")
	public TipoDocumentoEntity update(@RequestBody TipoDocumentoEntity obj,
			@PathVariable Long id) {
		return servicio.update(obj, id);
	}
	
	//eliminar -> @DeleteMapping
	//eliminar distrito
	@DeleteMapping("/{id}")
	public TipoDocumentoEntity delete(@PathVariable Long id) {
		return servicio.delete(id);
	}
	
	//habilitar -> actualizar parcial -> @PatchMapping
	//habilitar distrito
	@PatchMapping("/{id}")
	public TipoDocumentoEntity enable(@PathVariable Long id) {
		return servicio.enable(id);
	}
}
