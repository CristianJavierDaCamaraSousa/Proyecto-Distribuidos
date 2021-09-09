package com.distribuidos.proyecto.examples;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SumadorImpl extends UnicastRemoteObject implements Sumador {
    public SumadorImpl(String name) throws RemoteException {
        super();
        try {
            System.out.println("Rebind Object " + name);
            Naming.rebind(name, this);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }
}
