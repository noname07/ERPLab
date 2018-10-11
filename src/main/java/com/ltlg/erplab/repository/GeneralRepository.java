package com.ltlg.erplab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralRepository<T> extends JpaRepository<T, Integer> {}
