package com.ltlg.erplab.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Carrera;
import com.ltlg.erplab.repository.CarreraRepository;

@Service
public class CarreraService extends GeneralService<Carrera> {

	@Autowired
	private CarreraRepository repository;
	
}