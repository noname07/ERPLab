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

import com.ltlg.erplab.model.Carrera;
import com.ltlg.erplab.repository.CarreraRepository;

@RestController
public class CarreraController {

	@Autowired
	private CarreraRepository repository;

	@GetMapping("/carreras/{id}")
	public Optional<Carrera> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/carreras")
	public List<Carrera> all() {
		return repository.findAll();
	}

	@PostMapping("/carreras")
	public Carrera add(@RequestBody Carrera entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/carreras")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/carreras")
	public Carrera update(@RequestBody Carrera entity) {
		return repository.save(entity);
	}
}