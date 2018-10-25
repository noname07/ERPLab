package com.ltlg.erplab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltlg.erplab.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	    public Usuario findByEmail(String email);

	    public Usuario findByEmailAndPassword(String email, String password);
}