package com.vectorsf.activity;

import jarroba.invarato.fragmentos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase auxiliar con el contenido del listado
 * @author Google, modificado por Ramon Invarato Menéndez
 * @see {@link www.jarroba.es}
 */
public class Lista_contenido {

	/** 
	 * Donde se guardan las entradas de la lista.
	 */
	public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
	
	/** 
	 * Donde se asigna el identificador a cada entrada de la lista
	 */
	public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
	
	/** 
	 * Creamos estáticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0", R.drawable.im_buho, "Carlos", "966 777777"));
		aniadirEntrada(new Lista_entrada("1", R.drawable.im_colibri, "Kenny", "966 888888"));
		aniadirEntrada(new Lista_entrada("2", R.drawable.im_cuervo, "Elvis", "966 999999"));
		aniadirEntrada(new Lista_entrada("3", R.drawable.im_flamenco, "Manuel", "966 101010"));
		aniadirEntrada(new Lista_entrada("4", R.drawable.im_kiwi, "Juan", "966 111111"));
		aniadirEntrada(new Lista_entrada("5", R.drawable.im_loro, "Martin", "966 121212"));
		aniadirEntrada(new Lista_entrada("6", R.drawable.im_pavo, "Meli", "966 121212"));
		aniadirEntrada(new Lista_entrada("7", R.drawable.im_buho, "Carlos", "966 777777"));
		aniadirEntrada(new Lista_entrada("8", R.drawable.im_colibri, "Kenny", "966 888888"));
		aniadirEntrada(new Lista_entrada("9", R.drawable.im_cuervo, "Elvis", "966 999999"));
		aniadirEntrada(new Lista_entrada("10", R.drawable.im_flamenco, "Manuel", "966 101010"));
		aniadirEntrada(new Lista_entrada("11", R.drawable.im_kiwi, "Juan", "966 111111"));
		aniadirEntrada(new Lista_entrada("12", R.drawable.im_loro, "Martin", "966 121212"));
	}

	
	/** Añade una entrada a la lista
	 * @param entrada Elemento que añadimos a la lista
	 */
	private static void aniadirEntrada(Lista_entrada entrada) {
		ENTRADAS_LISTA.add(entrada);
		ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
	}

	/**
	 * Representa una entrada del contenido de la lista
	 */
	public static class Lista_entrada {
		public String id;
		public int idImagen; 
		public String textoEncima; 
		public String textoDebajo; 
		  
		public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) { 
			this.id = id;
		    this.idImagen = idImagen; 
		    this.textoEncima = textoEncima; 
		    this.textoDebajo = textoDebajo; 
		}
	}
	
}
