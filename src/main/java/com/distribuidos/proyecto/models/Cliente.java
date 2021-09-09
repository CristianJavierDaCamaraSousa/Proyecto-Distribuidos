package com.distribuidos.proyecto.models;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
//import java.rmi.registry.*;
//import java.rmi.server.*;

import com.distribuidos.proyecto.utils.Constantes;

public class Cliente {
    private ServicioOferta miOferta;

    Cliente() {
    }

    void accederObjetoRemoto(String ip) {
        try {
            this.miOferta = (ServicioOferta) Naming.lookup("rmi://" + ip + "/" + Constantes.NOMBRE_SERVICIO);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

}
