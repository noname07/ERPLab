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

import com.ltlg.erplab.model.Patrimonio;
import com.ltlg.erplab.repository.PatrimonioRepository;

@RestController
public class PatrimonioController {

	@Autowired
	private PatrimonioRepository repository;

	@GetMapping("/patrimonios/{id}")
	public Optional<Patrimonio> get(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/patrimonios")
	public List<Patrimonio> all() {
		return repository.findAll();
	}

	@PostMapping("/patrimonios")
	public Patrimonio add(@RequestBody Patrimonio entity) {
		return repository.save(entity);
	}

	@DeleteMapping("/patrimonios")
	public void remove(@PathVariable("id") int id) {
		repository.deleteById(id);
	}

	@PutMapping("/patrimonios")
	public Patrimonio update(@RequestBody Patrimonio entity) {
		return repository.save(entity);
	}

}
