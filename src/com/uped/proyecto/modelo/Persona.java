package com.uped.proyecto.modelo;

public abstract class Persona {
    protected String nombre;
    protected String dui;

    public Persona(String nombre, String dui) {
        this.nombre = nombre;
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDui() {
        return dui;
    }

    // Método final: no puede ser sobrescrito por ninguna subclase
    public final String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }

    public abstract double calcularBeneficioAnual();
}