package com.ltlg.erplab.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltlg.erplab.model.Ubicacion;
import com.ltlg.erplab.repository.UbicacionRepository;

@RestController
public class UbicacionController {

	@Autowired
	private UbicacionRepository repository;

	@GetMapping("/ubicaciones/{id}")
	public Optional<Ubicacion> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/ubicaciones")
	public List<Ubicacion> all() {
		return repository.findAll();
	}

	@PostMapping("/ubicaciones")
	public Ubicacion add(@RequestBody Ubicacion entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/ubicaciones")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/ubicaciones")
	public Ubicacion update(@RequestBody Ubicacion entity) {
		return repository.save(entity);
	}

}