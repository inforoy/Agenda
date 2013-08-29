package com.vectorsf.modelo;

import java.util.ArrayList;

public class Contacto {
	public int idContacto;
	public String nombres;
	public String apellidos;
	//public NumeroTelefonico numeros;
	public ArrayList<NumeroTelefonico> numeros;
	public int img;
	public String email;
	public String direccionMI; 
	public String direccion;
	public Empresa empresa;
	public String nota;
	public String timbre;
	
	public Contacto(){}
	
	public Contacto(int idContacto, String nombres, String apellidos, ArrayList<NumeroTelefonico> numeros, int img, String email, String direccionMI, String direccion, Empresa empresa, String nota, String timbre){
		this.idContacto = idContacto;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.numeros = numeros;
		this.img = img;
		this.email = email;
		this.direccionMI = direccionMI;
		this.direccion = direccion;
		this.empresa = empresa;
		this.nota = nota;
		this.timbre = timbre;
	}
	
	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<NumeroTelefonico> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<NumeroTelefonico> numeros) {
		this.numeros = numeros;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccionMI() {
		return direccionMI;
	}

	public void setDireccionMI(String direccionMI) {
		this.direccionMI = direccionMI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getTimbre() {
		return timbre;
	}

	public void setTimbre(String timbre) {
		this.timbre = timbre;
	}
	
	
	
}
