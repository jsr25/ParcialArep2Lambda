package co.escuelaing.edu.arep.api.impl;

import co.escuelaing.edu.arep.api.CalculApi;

/**
 * Clase que implementa los metodos de la calculadora
 *
 * Autor= Juan Sebastian Ramos Isaza
 */
public class CalculadoraApiImpl implements CalculApi {
    @Override
    public String ln(Double value) {
        return "{\"operation\":\"ln\",\"input\":"+value+",\"output\":"+Math.log(value)+"}";
    }

    @Override
    public String atan(Double value) {
        return "{\"operation\":\"atan\",\"input\":"+value+",\"output\":"+Math.atan(value)+"}";
    }
}
