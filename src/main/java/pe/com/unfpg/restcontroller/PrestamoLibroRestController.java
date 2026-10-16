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

import pe.com.unfpg.entity.PrestamoLibroEntity;
import pe.com.unfpg.service.PrestamoLibroService;

@RestController
@RequestMapping("/api/prestamolibro")
public class PrestamoLibroRestController {

	@Autowired
	private PrestamoLibroService servicio;

	@GetMapping
	public List<PrestamoLibroEntity> findAll() {
		return servicio.findAll();
	}

	@GetMapping("/custom")
	public List<PrestamoLibroEntity> findAllCustom() {
		return servicio.findAllCustom();
	}

	@GetMapping("/{id}")
	public PrestamoLibroEntity findById(@PathVariable Long id) {
		return servicio.findById(id);
	}

	@PostMapping
	public PrestamoLibroEntity add(@RequestBody PrestamoLibroEntity obj) {
		return servicio.add(obj);
	}

	@PutMapping("/{id}")
	public PrestamoLibroEntity update(@RequestBody PrestamoLibroEntity obj,
			@PathVariable Long id) {
		return servicio.update(obj, id);
	}

	@DeleteMapping("/{id}")
	public PrestamoLibroEntity delete(@PathVariable Long id) {
		return servicio.delete(id);
	}

	@PatchMapping("/{id}")
	public PrestamoLibroEntity enable(@PathVariable Long id) {
		return servicio.enable(id);
	}
}