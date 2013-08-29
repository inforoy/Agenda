package com.vectorsf.adaptador;

import jarroba.invarato.fragmentos.R;

import java.util.List;

import com.vectorsf.activity.Lista_contenido;
import com.vectorsf.modelo.Contacto;
import com.vectorsf.*;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorContacto_Nombres extends ArrayAdapter<Contacto>{
	 private Activity context;
	 private List<Contacto> listaContactos;
	 
	 public AdaptadorContacto_Nombres(Fragment context, List<Contacto> list){
		 super(context.getActivity(), R.layout.layout_elemento_listado,list);
		 this.context = context.getActivity();
		 this.listaContactos = list;		 
	 }
	 
	 public View getView(int position, View view, ViewGroup parent) {
		 LayoutInflater inflater = context.getLayoutInflater();
		 View item = inflater.inflate(R.layout.layout_elemento_listado, null);
		 
		 TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_titulo);		 
		 ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen_miniatura);
		 	 
		 
		 TextView  lblNombre = (TextView)item.findViewById(R.id.tvEditarNombre);
		 Contacto contacto = this.listaContactos.get(position);
		 lblNombre.setText(contacto.getNombres());
		 texto_superior_entrada.setText(contacto.getNombres());
		 imagen_entrada.setImageResource(contacto.getImg());
		 
		 
		/*
		 * if (entrada != null) {
					TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_titulo);
					if (texto_superior_entrada != null) {
						texto_superior_entrada.setText(((Lista_contenido.Lista_entrada) entrada).textoEncima);
					}

					ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen_miniatura);
					if (imagen_entrada != null) {
						imagen_entrada.setImageResource(((Lista_contenido.Lista_entrada) entrada).idImagen);
					}
		 * */
		 
		 return (item);
	 }
}
