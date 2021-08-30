package com.example.tp5ciudades;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import android.app.Fragment;

public class fragmentMostrarResultados extends Fragment {
    TextView txtMostrarNombreCiudad;
    TextView txtClimaActual;
    TextView txtTemperatura;
    TextView txtSensacionTermica;
    TextView txtHumedad;
    TextView txtVelocidadViento;


    public View onCreateView(LayoutInflater infladorDeLayout, ViewGroup GrupoDeLaVista, Bundle datosRecibidos) {
        View vistaADevolver;

        vistaADevolver=infladorDeLayout.inflate(R.layout.layout_mostrar_resultados, GrupoDeLaVista, false);

        txtMostrarNombreCiudad=vistaADevolver.findViewById(R.id.ciudadMostrada);
        txtClimaActual=vistaADevolver.findViewById(R.id.estadoClima);
        txtTemperatura=vistaADevolver.findViewById(R.id.temperatura);
        txtSensacionTermica=vistaADevolver.findViewById(R.id.sensacionTermica);
        txtHumedad=vistaADevolver.findViewById(R.id.humedad);
        txtVelocidadViento=vistaADevolver.findViewById(R.id.velocidadViento);



        MainActivity miActivityAnfitriona;
        miActivityAnfitriona=(MainActivity)getActivity();

        String NombreAmostrar;
        NombreAmostrar=miActivityAnfitriona.obtenerNombreIngresado();
        txtMostrarNombreCiudad.setText(NombreAmostrar);

        String estadoClimaAmostrar;
        estadoClimaAmostrar=miActivityAnfitriona.obtenerEstadodeClima();
        txtClimaActual.setText(estadoClimaAmostrar);

        String temperaturaAmostrar;
        temperaturaAmostrar=miActivityAnfitriona.obtenerTemperatura();
        txtTemperatura.setText(temperaturaAmostrar+"°C");

        String sensacionTermicaAmostrar;
        sensacionTermicaAmostrar=miActivityAnfitriona.obtenerSensacionTermica();
        txtSensacionTermica.setText(sensacionTermicaAmostrar+"°C");

        String humedadAmostrar;
        humedadAmostrar=miActivityAnfitriona.obtenerHumedad();
        txtHumedad.setText(humedadAmostrar+"%");

        String velocidadVientoAmostrar;
        velocidadVientoAmostrar=miActivityAnfitriona.obtenerVelocidadViento();
        txtVelocidadViento.setText(velocidadVientoAmostrar+" Km/h");


        return vistaADevolver;
    }
}
