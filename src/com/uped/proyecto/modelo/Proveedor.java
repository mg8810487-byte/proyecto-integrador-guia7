package com.uped.proyecto.modelo;

public class Proveedor extends Persona {
    private double montoFacturado;

    public Proveedor(String nombre, String dui, double montoFacturado) {
        super(nombre, dui);
        this.montoFacturado = montoFacturado;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    @Override
    public double calcularBeneficioAnual() {
        return montoFacturado * 0.03;
    }

    @Override
    public String toString() {
        return presentarse();
    }
}