package com.servicio1.A;

public class Producto {
    private String nombre;
    private double precio;
    private String cat;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Producto(String nombre, double precio, String cat) {
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
    }
}
