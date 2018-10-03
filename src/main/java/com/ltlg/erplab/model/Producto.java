package com.ltlg.erplab.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Producto {

	public int idProducto;
	public String descripcion;
	public boolean activo;
	public TipoProducto tipoProducto;
	public Marca marca;
	public Ubicacion ubicacion;
	public Patrimonio patrimonio;
	public Set<Producto> productos = new HashSet<Producto>(0);

	public Producto() {
		super();
	}

	public Producto(int idProducto2, String modelo, String descripcion2, boolean activo2, int idTipoProducto,
			int idMarca, int idRubro, int idProductoxProducto) {
		this.idProducto = idProducto2;
		this.descripcion = descripcion2;
		this.activo = activo2;
	}

	public Producto(int idProducto, String descripcion, boolean activo, TipoProducto tipoProducto, Marca marca,
			Ubicacion ubicacion, Patrimonio patrimonio) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.activo = activo;
		this.tipoProducto = tipoProducto;
		this.marca = marca;
		this.ubicacion = ubicacion;
		this.patrimonio = patrimonio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Patrimonio getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}

	public List<String> validate() {
		List<String> errores = new ArrayList<String>();

		if (this.getDescripcion().isEmpty()) {
			errores.add("El nombre es un campo obligatorio");

		}
		return errores;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
}
