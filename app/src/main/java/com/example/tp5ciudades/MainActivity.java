package com.example.tp5ciudades;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    FragmentManager adminFragments;
    FragmentTransaction transcFragments;

    String _NombreIngresado;
    String _estadoClimaActual;
    String _temperatura;
    String _sensacionTermica;
    String _humedad;
    String _velocidadViento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adminFragments=getFragmentManager();

        fragmentIngresoDatos frgIngreso;
        frgIngreso=new fragmentIngresoDatos();

        transcFragments=adminFragments.beginTransaction();
        transcFragments.replace(R.id.alojadorDeFragments, frgIngreso);
        transcFragments.commit();
    }
    public void RecibirDatosIngresados(String NombreIngresado, String estadoClimaActual, String temperatura, String sensacionTermica, String humedad, String velocidadViento){
        Log.d("ActividadPrincipal", "Se recibio:" +NombreIngresado+estadoClimaActual+temperatura+sensacionTermica+humedad+velocidadViento);

        _NombreIngresado=NombreIngresado;
        _estadoClimaActual=estadoClimaActual;
        _temperatura=temperatura;
        _sensacionTermica=sensacionTermica;
        _humedad=humedad;
        _velocidadViento=velocidadViento;

        fragmentMostrarResultados frgMuestra;
        frgMuestra=new fragmentMostrarResultados();
        transcFragments=adminFragments.beginTransaction();

        transcFragments.replace(R.id.alojadorDeFragments, frgMuestra);
        transcFragments.commit();

    }
    public String obtenerNombreIngresado(){
        return _NombreIngresado;
    }
    public String obtenerEstadodeClima(){
        return _estadoClimaActual;
    }
    public String obtenerTemperatura(){
        return _temperatura;
    }
    public String obtenerSensacionTermica(){
        return _sensacionTermica;
    }
    public String obtenerHumedad(){
        return _humedad;
    }
    public String obtenerVelocidadViento(){
        return _velocidadViento;
    }
}