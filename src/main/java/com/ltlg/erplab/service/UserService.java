package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.User;
import com.ltlg.erplab.repository.UserRepository;

@Service
public class UserService implements CrudService<User>{
	@Autowired
	private UserRepository repository;

	@Override
	public ResponseEntity<User> add(User entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@Override
	public ResponseEntity<User> remove(User entidad) {
		Optional<User> carreraOptional = repository.findById(entidad.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entidad);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<User> remove(int id) {
		Optional<User> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<User> update(User entity) {
		Optional<User> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<User>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<User> getById(int id) {
		Optional<User> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}
}
