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

import pe.com.unfpg.entity.LibroEntity;
import pe.com.unfpg.service.LibroService;

@RestController
@RequestMapping("/api/libro")
public class LibroRestController {

	@Autowired
	private LibroService servicio;

	@GetMapping
	public List<LibroEntity> findAll() {
		return servicio.findAll();
	}

	@GetMapping("/custom")
	public List<LibroEntity> findAllCustom() {
		return servicio.findAllCustom();
	}

	@GetMapping("/{id}")
	public LibroEntity findById(@PathVariable Long id) {
		return servicio.findById(id);
	}

	@PostMapping
	public LibroEntity add(@RequestBody LibroEntity obj) {
		return servicio.add(obj);
	}

	@PutMapping("/{id}")
	public LibroEntity update(@RequestBody LibroEntity obj, @PathVariable Long id) {
		return servicio.update(obj, id);
	}

	@DeleteMapping("/{id}")
	public LibroEntity delete(@PathVariable Long id) {
		return servicio.delete(id);
	}

	@PatchMapping("/{id}")
	public LibroEntity enable(@PathVariable Long id) {
		return servicio.enable(id);
	}
}