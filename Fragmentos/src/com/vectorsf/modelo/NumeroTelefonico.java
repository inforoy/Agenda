package com.vectorsf.modelo;

public class NumeroTelefonico {
	private int idNumero;
	private String descripcionTelefono;
	private String numeroTelefono;
	
	public NumeroTelefonico(){}
	
	public NumeroTelefonico(int idNumero, String descripcionTelefono, String numeroTelefono){
		this.idNumero = idNumero;
		this.descripcionTelefono = descripcionTelefono;
		this.numeroTelefono = numeroTelefono;
	}

	public int getIdNumero() {
		return idNumero;
	}

	public void setIdNumero(int idNumero) {
		this.idNumero = idNumero;
	}

	public String getDescripcionTelefono() {
		return descripcionTelefono;
	}

	public void setDescripcionTelefono(String descripcionTelefono) {
		this.descripcionTelefono = descripcionTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}	
	
}
