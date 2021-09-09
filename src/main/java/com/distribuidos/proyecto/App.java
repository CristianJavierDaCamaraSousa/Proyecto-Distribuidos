package com.distribuidos.proyecto;

import com.distribuidos.proyecto.models.Oferta;
import com.distribuidos.proyecto.utils.Archivos;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Oferta oferta1 = new Oferta(1, "holis");
        Oferta oferta2 = new Oferta(2, "chaoilis");

        System.out.println(Archivos.guardarOferta(oferta1));
        System.out.println(Archivos.guardarOferta(oferta2));

        System.out.println(Archivos.consultarOferta(1));
        System.out.println(Archivos.consultarOferta(2));
    }
}
    
