package com.ltlg.erplab.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface CrudService<T> {

	ResponseEntity<T> add(T entity);

	ResponseEntity<T> remove(T entity);

	ResponseEntity<T> remove(int id);

	ResponseEntity<T> update(T entity);

	ResponseEntity<List<T>> all();

	ResponseEntity<T> getById(int id);
}
