package com.example.examen_ciudades_javafx;

import javafx.scene.image.ImageView;

public class Ciudad {
    private String nombre;
    private String url;

    private double tarifa;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public Ciudad(String nombre, String url, double tarifa) {
        this.nombre = nombre;
        this.url = url;
        this.tarifa = tarifa;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

