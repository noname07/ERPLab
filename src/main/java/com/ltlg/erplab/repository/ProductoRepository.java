package com.ltlg.erplab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltlg.erplab.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
