package com.ltlg.erplab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltlg.erplab.model.Docente;
import com.ltlg.erplab.service.DocenteService;

@Controller
public class DocenteController {

    @Autowired
    private DocenteService service;

//    @RequestMapping("/resgistrarse")
//    @ResponseBody
//    public Long register(@RequestBody User usuario) {
//        return service.registerUser(usuario);
//    }
    
    @GetMapping("/altaDocente/{id}")
	public ResponseEntity<Docente> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/altaDocente", method = RequestMethod.GET)
	public ResponseEntity<List<Docente>> all() {
		return service.all();
	}

	@PostMapping(value = "/altaDocente")
	public ResponseEntity<Docente> add(@RequestBody Docente entity) {
		return service.add(entity);
	}

	@DeleteMapping("/altaDocente")
	public ResponseEntity<Docente> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/altaDocente")
	public ResponseEntity<Docente> update(@RequestBody Docente entity) {
		return service.update(entity);
	}
}
