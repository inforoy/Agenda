package com.vectorsf.activity;

import com.vectorsf.fragment.Fragment_Detalle;

import jarroba.invarato.fragmentos.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Esta actividad mantiene un �nico fragmento en la pantalla, con el contenido de la entrada. Solo la usar�n los m�viles.
 * @author Google, modificado por Ramon Invarato Men�ndez
 * @see {@link www.jarroba.es}
 */
public class Activity_Detalle extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_detalle);
		
		// Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es as� se a�ade el fragmento al contenedor
		if (savedInstanceState == null) {
			// Crea el fragmento del detalle de la entrada y lo a�ade a la actividad
			Bundle arguments = new Bundle();
			arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA));
			Fragment_Detalle fragment = new Fragment_Detalle();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction().add(R.id.framelayout_contenedor_detalle, fragment).commit();
		}
	}

}
