package com.ltlg.erplab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ltlg.erplab.model.Espacio;
import com.ltlg.erplab.service.EspacioService;

@RestController
public class EspacioController {

	@Autowired
	private EspacioService service;

	@GetMapping("/espacios/{id}")
	public ResponseEntity<Espacio> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/espacios", method = RequestMethod.GET)
	public ResponseEntity<List<Espacio>> all() {
		return service.all();
	}

	@PostMapping(value = "/espacios")
	public ResponseEntity<Espacio> add(@RequestBody Espacio entity) {
		return service.add(entity);
	}

	@DeleteMapping("/espacios")
	public ResponseEntity<Espacio> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/espacios")
	public ResponseEntity<Espacio> update(@RequestBody Espacio entity) {
		return service.update(entity);
	}
}
