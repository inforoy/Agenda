package com.vectorsf.repository;

import jarroba.invarato.fragmentos.R;

import java.util.ArrayList;
import java.util.List;

import com.vectorsf.modelo.Contacto;
import com.vectorsf.modelo.Empresa;
import com.vectorsf.modelo.NumeroTelefonico;



public class ContactoRepositoryImpl implements ContactoRepository{
	
	@Override
	public List<Contacto> obtenerListadoNombres() {
		List<Contacto> lista = new ArrayList<Contacto>();
		Contacto contacto;
		
		for(int i=0; i<20 ;i++){
			contacto  = new Contacto();
			contacto.setIdContacto(i);			
			contacto.setNombres("Nombre "+"["+i+"]");
			contacto.setApellidos("Apellidos "+"["+i+"]");		
			
			contacto.setImg(R.drawable.im_buho);
			contacto.setEmail("Correo"+"["+i+"]"+"@gmail.com");
			contacto.setDireccionMI("DireccionMI "+i);
			contacto.setDireccion("direccion "+i);
			
			Empresa empresa = new Empresa();
			empresa.setDescripcionEmpresa("Empresa "+i);
			empresa.setCargo("Desarrollador "+i);
			contacto.setEmpresa(empresa);
			
			contacto.setNota("nota "+i);
			contacto.setTimbre("timbre "+i);
			
			lista.add(contacto);
		}
		
		return lista;
	}
	
	@Override
	public List<Contacto> obtenerListadoNumeros(int id) {
		List<Contacto> lista = new ArrayList<Contacto>();
		Contacto contacto;
		
		for(int i=0; i<5 ;i++){
			contacto  = new Contacto();
			contacto.setIdContacto(i);			
			contacto.setNombres("Nombre "+"["+i+"]");
			contacto.setApellidos("Apellidos "+"["+i+"]");
			
			
			ArrayList<NumeroTelefonico> listaNumeros = new ArrayList<NumeroTelefonico>();
			for(int j=0;j<3;j++){
				NumeroTelefonico numeroTelefonico = new NumeroTelefonico();
				numeroTelefonico.setDescripcionTelefono("Claro");
				numeroTelefonico.setNumeroTelefono("966874515");												
				listaNumeros.add(numeroTelefonico);			
			}
			contacto.setNumeros(listaNumeros);
			
			
			contacto.setImg(R.drawable.im_buho);
			contacto.setEmail("Correo"+"["+i+"]"+"@gmail.com");
			contacto.setDireccionMI("DireccionMI "+i);
			contacto.setDireccion("direccion "+i);
			
			Empresa empresa = new Empresa();
			empresa.setDescripcionEmpresa("Empresa "+i);
			empresa.setCargo("Desarrollador "+i);
			contacto.setEmpresa(empresa);
			
			contacto.setNota("nota "+i);
			contacto.setTimbre("timbre "+i);
			
			lista.add(contacto);
		}
		
		return lista;
	}
}