package com.vectorsf.adaptador;

import jarroba.invarato.fragmentos.R;

import java.util.List;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.vectorsf.modelo.Contacto;

public class AdaptadorContacto_NumerosTelefonicos extends ArrayAdapter<Contacto>{
	 private Activity context;
	 private List<Contacto> listaContactos;
	 
	 public AdaptadorContacto_NumerosTelefonicos(Fragment context, List<Contacto> list){
		 super(context.getActivity(), R.layout.layout_listitem_numero,list);
		 this.context = context.getActivity();
		 this.listaContactos = list;
	 }
	 
	 public View getView(int position, View view, ViewGroup parent) {		 
		 LayoutInflater inflater = context.getLayoutInflater();
		 View item = inflater.inflate(R.layout.layout_listitem_numero, null);
		 
		 TextView lblDescripcion = (TextView) item.findViewById(R.id.LblEditarDescripcion);		
		 TextView lblNumero = (TextView) item.findViewById(R.id.LblEditarNumero);		 
		 
		 Contacto contacto = this.listaContactos.get(position);
		 lblDescripcion.setText(contacto.getNumeros().get(0).getDescripcionTelefono());
		 lblNumero.setText(contacto.getNumeros().get(0).getNumeroTelefono());		 
		 
		 return item;		 
	 }
	 
	 
}
