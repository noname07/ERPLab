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

import com.ltlg.erplab.model.Reserva;
import com.ltlg.erplab.service.ReservaService;

@RestController
public class ReservaController {

	@Autowired
	private ReservaService service;

	@GetMapping("/reservas/{id}")
	public ResponseEntity<Reserva> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/reservas", method = RequestMethod.GET)
	public ResponseEntity<List<Reserva>> all() {
		return service.all();
	}

	@PostMapping(value = "/reservas")
	public ResponseEntity<Reserva> add(@RequestBody Reserva entity) {
		return service.add(entity);
	}

	@DeleteMapping("/reservas")
	public ResponseEntity<Reserva> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/reservas")
	public ResponseEntity<Reserva> update(@RequestBody Reserva entity) {
		return service.update(entity);
	}
}
