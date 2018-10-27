package com.ltlg.erplab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltlg.erplab.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{

}
