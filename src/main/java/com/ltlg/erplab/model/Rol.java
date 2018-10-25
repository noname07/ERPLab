package com.ltlg.erplab.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Rol {
    private Long id;
    private String nombre;
    private Set<Usuario> usuarios;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsers(Set<Usuario> usuario) {
        this.usuarios = usuario;
    }
}