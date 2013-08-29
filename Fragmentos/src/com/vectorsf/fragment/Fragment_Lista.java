package com.vectorsf.fragment;

import java.util.List;

import com.vectorsf.activity.Lista_contenido;
import com.vectorsf.adaptador.AdaptadorContacto_Nombres;
import com.vectorsf.adaptador.Lista_adaptador;
import com.vectorsf.modelo.Contacto;
import com.vectorsf.repository.ContactoRepository;
import com.vectorsf.repository.ContactoRepositoryImpl;

import jarroba.invarato.fragmentos.R;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Representa un listado de entradas.
 * 
 * @author Google, modificado por Ramon Invarato Menéndez
 * @see {@link www.jarroba.es}
 */
public class Fragment_Lista extends ListFragment {

	private ListView idListView_listadoContactos;
	private ContactoRepository daoContactoRepository_obtenerNombres;
	private List<Contacto> listadoContactosPorNombre;

	/**
	 * El callback del fragmento que notificará de pulsaciones en la lista
	 */
	private Callbacks mCallbacks = CallbacksVacios;

	/**
	 * Todas las actividades que contengan este fragmento deben implementar la
	 * interfaz del este callback. Permite notificar a las actividades de los
	 * elementos seleccionados
	 */
	public interface Callbacks {
		/**
		 * Método Callback que escucha cuando un elemento de la lista ha sido
		 * pulsado, entonces entra aquí. Devuelve el ID del elemento de la lista
		 * que fue seleccionado
		 */
		public void onEntradaSelecionada(String id);
	}

	/**
	 * Una implementacón de la interface cuando la interfaz no hace nada. Se
	 * usuará cuando el fragmento no esté ligado a la actividad
	 */
	private static Callbacks CallbacksVacios = new Callbacks() {
		@Override
		public void onEntradaSelecionada(String id) {
		}
	};

	/**
	 * Es obligatorio un contructor vacío para instanciar el fragmento
	 */
	public Fragment_Lista() {

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new Lista_adaptador(getActivity(), R.layout.layout_elemento_listado, Lista_contenido.ENTRADAS_LISTA) {

			@Override
			public void onEntrada(Object entrada, View view) {
				if (entrada != null) {
					TextView texto_superior_entrada = (TextView) view .findViewById(R.id.textView_titulo);
					if (texto_superior_entrada != null) {
						texto_superior_entrada.setText(((Lista_contenido.Lista_entrada) entrada).textoEncima);
					}

					ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen_miniatura);
					if (imagen_entrada != null) {
						imagen_entrada.setImageResource(((Lista_contenido.Lista_entrada) entrada).idImagen);
					}

				}
			}
		});

	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		// Las actividades que contengan este fragmento deben implementar este
		// callback
		if (!(activity instanceof Callbacks)) {
			throw new IllegalStateException(
					"Error: La actividad debe implementar el callback del fragmento");
		}

		mCallbacks = (Callbacks) activity;
	}

	@Override
	public void onDetach() {
		super.onDetach();

		// Resetear los callbacks activos a los vacíos.
		mCallbacks = CallbacksVacios;
	}

	@Override
	public void onListItemClick(ListView listView, View view, int posicion,
			long id) {
		super.onListItemClick(listView, view, posicion, id);

		// Notificar a la actividad, por medio de la interfaz del callback, que
		// un elemento ha sido seleccionado
		mCallbacks.onEntradaSelecionada(Lista_contenido.ENTRADAS_LISTA.get(posicion).id);
	}

	// modificando

	@Override
	public void onActivityCreated(Bundle state) {
		super.onActivityCreated(state);

		//idListView_listadoContactos = (ListView) getView().findViewById(R.id.fragment_listado); // error
		
		//daoContactoRepository_obtenerNombres = getContactoRepositoryImpl();
		//listadoContactosPorNombre = daoContactoRepository_obtenerNombres.obtenerListadoNombres();

		//for (int i = 0; i < listadoContactosPorNombre.size(); i++) {
		//	System.out.println("Contacto::::: "+ listadoContactosPorNombre.get(i).getNombres());
		//}

		 //AdaptadorContacto_Nombres adaptadorContacto_Nombres = new AdaptadorContacto_Nombres(this, listadoContactosPorNombre);
		 //idListView_listadoContactos.setAdapter(adaptadorContacto_Nombres);
		/*		
		setListAdapter(new Lista_adaptador(getActivity(),	R.layout.layout_elemento_listado, Lista_contenido.ENTRADAS_LISTA) {
			@Override
			public void onEntrada(Object entrada, View view) {
				if (entrada != null) {
					TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_titulo);
					if (texto_superior_entrada != null) {
						texto_superior_entrada.setText(((Lista_contenido.Lista_entrada) entrada).textoEncima);
					}

					ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen_miniatura);
					if (imagen_entrada != null) {
						imagen_entrada.setImageResource(((Lista_contenido.Lista_entrada) entrada).idImagen);
					}

				}
			}
		});
		*/
		/* ini
		setListAdapter(new Lista_adaptador(getActivity(),	R.layout.layout_elemento_listado, Lista_contenido.ENTRADAS_LISTA) {
			@Override
			public void onEntrada(Object entrada, View view) {
				if (entrada != null) {
					TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_titulo);
					if (texto_superior_entrada != null) {
						texto_superior_entrada.setText(((Lista_contenido.Lista_entrada) entrada).textoEncima);
					}

					ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen_miniatura);
					if (imagen_entrada != null) {
						imagen_entrada.setImageResource(((Lista_contenido.Lista_entrada) entrada).idImagen);
					}

				}
			}
		});
		*/ 
	}

	//public ContactoRepositoryImpl getContactoRepositoryImpl() {
	//	return new ContactoRepositoryImpl();
	//}

}
