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
import org.springframework.web.bind.annotation.ResponseBody;

import com.ltlg.erplab.model.Usuario;
import com.ltlg.erplab.service.UsuarioService;

@Controller
public class UserController {

    @Autowired
    private UsuarioService service;

    @RequestMapping("/resgistrarse")
    @ResponseBody
    public Long register(@RequestBody Usuario usuario) {
        return service.registerUser(usuario);
    }
    
    @GetMapping("/resgistrarse/{id}")
	public ResponseEntity<Usuario> get(@RequestParam("id") int id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/resgistrarse", method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> all() {
		return service.all();
	}

	@PostMapping(value = "/registrarse")
	public ResponseEntity<Usuario> add(@RequestBody Usuario entity) {
		return service.add(entity);
	}

	@DeleteMapping("/registrarse")
	public ResponseEntity<Usuario> remove(@RequestParam("id") int id) {
		return service.remove(id);
	}

	@PutMapping("/registrarse")
	public ResponseEntity<Usuario> update(@RequestBody Usuario entity) {
		return service.update(entity);
	}
}
