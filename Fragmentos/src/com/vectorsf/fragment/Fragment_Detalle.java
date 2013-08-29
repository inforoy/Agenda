package com.vectorsf.fragment;

import java.util.List;

import com.vectorsf.activity.Lista_contenido;
import com.vectorsf.activity.Lista_contenido.Lista_entrada;
import com.vectorsf.adaptador.AdaptadorContacto_NumerosTelefonicos;
import com.vectorsf.modelo.Contacto;
import com.vectorsf.repository.ContactoRepository;
import com.vectorsf.repository.ContactoRepositoryImpl;

import jarroba.invarato.fragmentos.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Este fragmento representa el detalle de la entrada seleccionada en la lista.
 * 
 * @author Google, modificado por Ramon Invarato Menéndez
 * @see {@link www.jarroba.es}
 */
public class Fragment_Detalle extends Fragment {

	private ListView idListView_listadoContactos;
	private ContactoRepository daoContactoRepository_obtenerNumeros;
	private List<Contacto> listadoContactosPorNumero;

	/**
	 * El argumento que representa el ID del elemento selecionado en la lista y
	 * que a este fragmento le llega para cargar el contenido apropiado
	 */
	public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";

	/**
	 * El contenido que cargaremos en este fragmento
	 */
	private Lista_contenido.Lista_entrada mItem;

	/**
	 * Es obligatorio un contructor vacío para instanciar el fragmento
	 */
	public Fragment_Detalle() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
			// Cargamos el contenido de la entrada con cierto ID seleccionado en
			// la lista. Se recomiendo usar un Loader para cargar el contenido
			mItem = Lista_contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.layout_fragment_detalle, container, false);

		// Mostramos el contenido al usuario
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.textView_superior)).setText(mItem.textoEncima);
			((TextView) rootView.findViewById(R.id.textView_inferior)).setText(mItem.textoDebajo);
			((TextView) rootView.findViewById(R.id.textView_inferior2)).setText(mItem.textoDebajo);
			((TextView) rootView.findViewById(R.id.textView_inferior3)).setText(mItem.textoDebajo);
			((ImageView) rootView.findViewById(R.id.imageView_imagen)).setImageResource(mItem.idImagen);
		}

		return rootView;
	}

	// para usar los eventos de un boton
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		System.out.println("cargando ui");
		Toast.makeText(getActivity().getApplicationContext(), "cargando Editar", Toast.LENGTH_SHORT).show();
		final Button btnClicEditar = (Button) getActivity().findViewById(R.id.btnEditar);
		
		//ini
		idListView_listadoContactos = (ListView) getView().findViewById(R.id.idListaNumeros);
		daoContactoRepository_obtenerNumeros = getContactoRepositoryImpl();
		// obtenemos el idContacto
		int idContacto = 0;
		listadoContactosPorNumero = daoContactoRepository_obtenerNumeros.obtenerListadoNumeros(idContacto);
		
		AdaptadorContacto_NumerosTelefonicos adaptadorNumeros = new AdaptadorContacto_NumerosTelefonicos(this, listadoContactosPorNumero);
		idListView_listadoContactos.setAdapter(adaptadorNumeros);
		//fin
		
		
		btnClicEditar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btnClicEditar != null){					
					FragmentManager fm = getActivity().getSupportFragmentManager();					
		            Fragment editor = fm.findFragmentById(R.id.framelayout_contenedor_detalle);
		            // Preguntamos si es el comportamiento de un Smartphone
		            if (editor == null) {
		            	// comportamiento Smartphone
		            	Toast.makeText(getActivity().getApplicationContext(), "Smartphone", Toast.LENGTH_SHORT).show();		            	
		            }else{
		            	// comportamiento Tablet		            	
		            	Fragment_Editar editarFragment = new Fragment_Editar();
		            	FragmentTransaction ft = fm.beginTransaction();		            	 
			            ft.replace(R.id.framelayout_contenedor_detalle, editarFragment);			             
			            ft.commit();		            	
		            }
		            
				}
				
			}
		});
		
		
	}

	public ContactoRepositoryImpl getContactoRepositoryImpl() {
		return new ContactoRepositoryImpl();
	}

}
