package com.distribuidos.proyecto.models;

import java.rmi.RemoteException;

public interface ServicioOferta extends java.rmi.Remote {

    public boolean registrarOfertas(Oferta oferta) throws RemoteException;

    public Oferta consultarOfertas(int id) throws RemoteException;

}