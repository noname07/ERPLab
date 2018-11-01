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

import com.ltlg.erplab.model.TipoProducto;
import com.ltlg.erplab.repository.TipoProductoRepository;

@RestController
public class TipoProductoController {

	@Autowired
	private TipoProductoRepository repository;

	@GetMapping("/tipoProductos/{id}")
	public Optional<TipoProducto> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/tipoProductos")
	public List<TipoProducto> all() {
		return repository.findAll();
	}

	@PostMapping("/tipoProductos")
	public TipoProducto add(@RequestBody TipoProducto entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/tipoProductos")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/tipoProductos")
	public TipoProducto update(@RequestBody TipoProducto entity) {
		return repository.save(entity);
	}

}