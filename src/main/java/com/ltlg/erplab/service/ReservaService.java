package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Reserva;
import com.ltlg.erplab.repository.ReservaRepository;

@Service
public class ReservaService implements CrudService<Reserva> {

	@Autowired
	private ReservaRepository repository;

	@Override
	public ResponseEntity<Reserva> add(Reserva entity) {
		repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@Override
	public ResponseEntity<Reserva> remove(Reserva entity) {
		Optional<Reserva> carreraOptional = repository.findById(entity.getIdReserva());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.delete(entity);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Reserva> remove(int id) {
		Optional<Reserva> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Reserva> update(Reserva entity) {
		Optional<Reserva> carreraOptional = repository.findById(entity.getIdReserva());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<Reserva>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<Reserva> getById(int id) {
		Optional<Reserva> carreraOptional = repository.findById(id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}

}