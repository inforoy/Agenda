package com.vectorsf.modelo;

public class Empresa {
	public String descripcionEmpresa;
	public String cargo;

	public Empresa(){
		
	}
	
	public Empresa(String empresa, String cargo){
		this.descripcionEmpresa = empresa;
		this.cargo = cargo;
	}

	public String getDescripcionEmpresa() {
		return descripcionEmpresa;
	}

	public void setDescripcionEmpresa(String descripcionEmpresa) {
		this.descripcionEmpresa = descripcionEmpresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
}
