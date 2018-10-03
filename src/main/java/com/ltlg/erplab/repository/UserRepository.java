package com.ltlg.erplab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltlg.erplab.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByName(String username);

}
