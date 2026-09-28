package com.uped.proyecto.modelo;

// Clase final: no puede ser heredada por ninguna otra clase
public final class DocenteInvestigador extends Docente {
    private int numeroPublicaciones;

    public DocenteInvestigador(String nombre, String dui, String especialidad, int aniosExperiencia, int numeroPublicaciones) {
        super(nombre, dui, especialidad, aniosExperiencia);
        this.numeroPublicaciones = numeroPublicaciones;
    }

    public int getNumeroPublicaciones() {
        return numeroPublicaciones;
    }

    @Override
    public double calcularBeneficioAnual() {
        double base = super.calcularBeneficioAnual();
        return base + (numeroPublicaciones * 30.0);
    }

    @Override
    public String toString() {
        return presentarse();
    }
}