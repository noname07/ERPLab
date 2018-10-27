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

import com.ltlg.erplab.model.Espacio;
import com.ltlg.erplab.repository.EspacioRepository;

@RestController
public class EspacioController {

	@Autowired
	private EspacioRepository repository;

	@GetMapping("/espacios/{id}")
	public Optional<Espacio> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/espacios")
	public List<Espacio> all() {
		return repository.findAll();
	}

	@PostMapping("/espacios")
	public Espacio add(@RequestBody Espacio entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/espacios")
	public List<Espacio> remove(@PathVariable("id") int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

	@PutMapping("/espacios")
	public Espacio update(@RequestBody Espacio entity) {
		return repository.save(entity);
	}
}
