package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Carrera;
import com.ltlg.erplab.repository.CarreraRepository;

@Service
public class CarreraService implements CrudService<Carrera> {

	@Autowired
	private CarreraRepository repository;

	@Override
	public ResponseEntity<Carrera> add(Carrera entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@Override
	public ResponseEntity<Carrera> remove(Carrera entity) {
		Optional<Carrera> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entity);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Carrera> remove(int id) {
		Optional<Carrera> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Carrera> update(Carrera entity) {
		Optional<Carrera> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<Carrera>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<Carrera> getById(int id) {
		Optional<Carrera> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}

}