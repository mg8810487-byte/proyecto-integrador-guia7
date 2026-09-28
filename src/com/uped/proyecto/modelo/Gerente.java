package com.uped.proyecto.modelo;

public class Gerente extends Empleado {
    private int tamanoEquipo;

    public Gerente(String nombre, String dui, double salario, int tamanoEquipo) {
        super(nombre, dui, salario);
        this.tamanoEquipo = tamanoEquipo;
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    @Override
    public double calcularBeneficioAnual() {
        double base = super.calcularBeneficioAnual();
        return base + (tamanoEquipo * 25.0);
    }

    @Override
    public String toString() {
        return presentarse() + " | Equipo: " + tamanoEquipo;
    }
}