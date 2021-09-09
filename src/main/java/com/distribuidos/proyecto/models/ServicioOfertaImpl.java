package com.distribuidos.proyecto.models;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.distribuidos.proyecto.utils.Archivos;

public class ServicioOfertaImpl extends UnicastRemoteObject implements ServicioOferta {

    public ServicioOfertaImpl(String name) throws RemoteException {
        super();
        try {
            System.out.println("Rebind Object" + name);
            Naming.rebind(name, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean registrarOfertas(Oferta oferta) throws RemoteException {
        // Guardar Oferta en archivo
        return Archivos.guardarOferta(oferta);
    }

    @Override
    public Oferta consultarOfertas(int id) throws RemoteException {
        // TODO Auto-generated method stub
        return Archivos.consultarOferta(id);
    }

}
