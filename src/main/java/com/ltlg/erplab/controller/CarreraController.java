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

import com.ltlg.erplab.model.Carrera;
import com.ltlg.erplab.service.CarreraService;

@RestController
public class CarreraController {

	@Autowired
	private CarreraService service;

	@GetMapping("/carreras/{id}")
	public ResponseEntity<Carrera> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/carreras", method = RequestMethod.GET)
	public ResponseEntity<List<Carrera>> all() {
		return service.all();
	}

	@PostMapping(value = "/carreras")
	public ResponseEntity<Carrera> add(@RequestBody Carrera entity) {
		return service.add(entity);
	}

	@DeleteMapping("/carreras")
	public ResponseEntity<Carrera> remove(@RequestParam("id") int id) {
		System.out.println("DELETE CARRERAAAAAAAAAAAAAAAAA");
		return service.remove(id);
	}

	@PutMapping("/carreras")
	public ResponseEntity<Carrera> update(@RequestBody Carrera entity) {
		return service.update(entity);
	}
}
