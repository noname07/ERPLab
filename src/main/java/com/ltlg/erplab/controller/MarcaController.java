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

import com.ltlg.erplab.model.Marca;
import com.ltlg.erplab.repository.MarcaRepository;

@RestController
public class MarcaController {

	@Autowired
	private MarcaRepository repository;

	@GetMapping("/marcas/{id}")
	public Optional<Marca> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/marcas")
	public List<Marca> all() {
		return repository.findAll();
	}

	@PostMapping("/marcas")
	public Marca add(@RequestBody Marca entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/marcas")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/marcas")
	public Marca update(@RequestBody Marca entity) {
		return repository.save(entity);
	}
}
