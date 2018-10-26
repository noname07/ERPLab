package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Docente;
import com.ltlg.erplab.repository.DocenteRepository;


@Service
public class DocenteService implements CrudService<Docente>{

	@Autowired
	private DocenteRepository repository;

	@Override
	public ResponseEntity<Docente> add(Docente entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@Override
	public ResponseEntity<Docente> remove(Docente entity) {
		Optional<Docente> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entity);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Docente> remove(int id) {
		Optional<Docente> docenteOptional = repository.findById(id);

		if (!docenteOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Docente> update(Docente entity) {
		Optional<Docente> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<Docente>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<Docente> getById(int id) {
		Optional<Docente> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}

}
