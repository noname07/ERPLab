package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Espacio;
import com.ltlg.erplab.repository.EspacioRepository;

@Service
public class EspacioService implements CrudService<Espacio> {

	@Autowired
	private EspacioRepository repository;

	@Override
	public ResponseEntity<Espacio> add(Espacio entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@Override
	public ResponseEntity<Espacio> remove(Espacio entity) {
		Optional<Espacio> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entity);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<Espacio> remove(int id) {
		Optional<Espacio> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<Espacio> update(Espacio entity) {
		Optional<Espacio> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<Espacio>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<Espacio> getById(int id) {
		Optional<Espacio> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}
}
