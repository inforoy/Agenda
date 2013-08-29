package com.vectorsf.repository;

import java.util.List;

import com.vectorsf.modelo.Contacto;

public interface ContactoRepository {
	
	public List<Contacto>  obtenerListadoNombres();

	List<Contacto> obtenerListadoNumeros(int id);
	
}
