package com.distribuidos.proyecto.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.distribuidos.proyecto.models.Oferta;

class MyObjectOutputStream extends ObjectOutputStream {
    MyObjectOutputStream() throws IOException {
        super();
    }

    MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    public void writeStreamHeader() throws IOException {
        return;
    }
}

public class Archivos {

    private static final String FIle_OFERTAS = "BaseDatosOfertas";
    private static File f = new File(FIle_OFERTAS);

    /**
     * Metodo que guarda una oferta en un archivo
     * 
     * @param oferta
     */
    public static boolean guardarOferta(Oferta o) {
        boolean status = false;
        if (o != null) {
            try {
                FileOutputStream fos = null;
                fos = new FileOutputStream(FIle_OFERTAS, true);
                if (f.length() == 0) {
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(o);
                    oos.close();
                } else {

                    MyObjectOutputStream oos = null;
                    oos = new MyObjectOutputStream(fos);
                    oos.writeObject(o);
                    oos.close();
                }

                fos.close();
            } catch (Exception e) {
                System.out.println("Error Occurred" + e);
            }
            status = true;
        }
        return status;
    }

    /**
     * Metodo que lee una oferta de un archivo
     * 
     * @param oferta
     */
    public static Oferta consultarOferta(int id) {
        Oferta o = null;
        try {
            f.createNewFile();
        } catch (Exception e) {
        }

        if (f.length() != 0) {
            try {
                FileInputStream fis = null;

                fis = new FileInputStream(FIle_OFERTAS);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (fis.available() != 0) {
                    o = (Oferta) ois.readObject();
                    if (o.getId() == id) {
                        break;
                    }
                }

                ois.close();
                fis.close();
            } catch (Exception e) {
                System.out.println("Error Occurred" + e);
                e.printStackTrace();
            }
        }
        return o;
    }

}
