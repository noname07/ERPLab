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

import com.ltlg.erplab.model.Producto;
import com.ltlg.erplab.repository.ProductoRepository;

@RestController
public class ProductoController {

	@Autowired
	private ProductoRepository repository;

	@GetMapping("/productos/{id}")
	public Optional<Producto> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/productos")
	public List<Producto> all() {
		return repository.findAll();
	}

	@PostMapping("/productos")
	public Producto add(@RequestBody Producto entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/productos")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/productos")
	public Producto update(@RequestBody Producto entity) {
		return repository.save(entity);
	}
}