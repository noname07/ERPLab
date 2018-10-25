package com.ltlg.erplab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ltlg.erplab.model.Usuario;
import com.ltlg.erplab.repository.RolRepository;
import com.ltlg.erplab.repository.UsuarioRepository;

@Service
public class UsuarioService implements CrudService<Usuario> {
	 @Autowired
	 private UsuarioRepository repository;
	 
//	 @Autowired
//	 private UsuarioRepository userRepository;
//	 @Autowired
//	 private RolRepository roleRepository;
//	 @Autowired
//	 private BCryptPasswordEncoder bCryptPasswordEncoder;

//	 @Override
//	 public void save(Usuario usuario) {
//		 usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
//	     usuario.setRoles(new HashSet<>(roleRepository.findAll()));
//	     userRepository.save(usuario);
//	 }
//
//	 @Override
//	 public User findByUsername(String username) {
//		 return userRepository.findByUsername(username);
//	 }
	    
	 public Long registerUser(Usuario usuario) {
		 usuario.setPassword(new BCryptPasswordEncoder().encode(usuario.password));
	     repository.save(usuario);
	     return usuario.getId();
	 }
	 @Override
	 public ResponseEntity<Usuario> add(Usuario entity) {
		 repository.save(entity);
		 return ResponseEntity.ok(entity);
	 }

	@Override
	public ResponseEntity<Usuario> remove(Usuario entity) {
	Optional<Usuario> usuarioOpcional = repository.findById(entity.getId());

	if (!usuarioOpcional.isPresent())
		return ResponseEntity.noContent().build();

		repository.delete(entity);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Usuario> remove(int id) {
		Optional<Usuario> usuarioOpcional = repository.findById((long) id);

		if (!usuarioOpcional.isPresent())
			return ResponseEntity.noContent().build();

		repository.deleteById((long) id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public ResponseEntity<Usuario> update(Usuario entity) {
		Optional<Usuario> carreraOptional = repository.findById(entity.getId());

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		repository.save(entity);
		return ResponseEntity.status(HttpStatus.OK).body(entity);
	}

	@Override
	public ResponseEntity<List<Usuario>> all() {
		return ResponseEntity.ok(repository.findAll());
	}

	@Override
	public ResponseEntity<Usuario> getById(int id) {
		Optional<Usuario> carreraOptional = repository.findById((long) id);

		if (!carreraOptional.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(carreraOptional.get());
	}
}

