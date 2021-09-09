package com.distribuidos.proyecto.examples;

public class SumadorServer {
    public static void main(String args[]) {
        try {
            SumadorImpl misuma = new SumadorImpl("rmi://localhost:1099" + "/MiSumador");
        } catch (Exception e) {
            System.err.println("System exception" + e);
        }
    }
}