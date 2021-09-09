package com.distribuidos.proyecto.models;

import com.distribuidos.proyecto.utils.Constantes;

public class OfertaServer {
    
    private ServicioOfertaImpl oferta;

    void iniciar() {
        try {
            String url = "rmi://" + Constantes.HOST + "/" + Constantes.NOMBRE_SERVICIO;
            oferta = new ServicioOfertaImpl(url);
        } catch (Exception e) {
        }
    }
    
}
