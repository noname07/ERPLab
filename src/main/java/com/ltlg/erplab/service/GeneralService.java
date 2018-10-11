package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.repository.GeneralRepository;

@Service
public abstract class GeneralService<GeneralEntity> implements CrudService<GeneralEntity> {
	
	public GeneralRepository<GeneralEntity> repository;

	public ResponseEntity<GeneralEntity> add(GeneralEntity entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	public ResponseEntity<GeneralEntity> remove(GeneralEntity entidad) {
		Optional<GeneralEntity> tOptional = repository.findById(entidad.getId());

		if (!tOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entidad);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<GeneralEntity> remove(int id) {
		Optional<GeneralEntity> tOptional = repository.findById(id);

		if (!tOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<GeneralEntity> update(GeneralEntity entity) {
		Optional<GeneralEntity> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	public ResponseEntity<List<GeneralEntity>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	public ResponseEntity<GeneralEntity> getById(int id) {
		Optional<GeneralEntity> tOptional = repository.findById(id);

		if (!tOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(tOptional.get());
	}
}
