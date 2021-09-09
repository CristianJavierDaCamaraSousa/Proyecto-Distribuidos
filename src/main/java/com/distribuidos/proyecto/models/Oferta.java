package com.distribuidos.proyecto.models;

import java.io.Serializable;
import java.util.Objects;

public class Oferta implements Serializable {
    private int id;
    private String sector;
    public Oferta() {
    }

    public Oferta(int id, String sector) {
        this.id = id;
        this.sector = sector;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Oferta id(int id) {
        setId(id);
        return this;
    }

    public Oferta sector(String sector) {
        setSector(sector);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Oferta)) {
            return false;
        }
        Oferta oferta = (Oferta) o;
        return id == oferta.id && Objects.equals(sector, oferta.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sector);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", sector='" + getSector() + "'" +
            "}";
    }

}