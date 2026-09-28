package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Docente(String nombre, String dui, String especialidad, int aniosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public double calcularBeneficioAnual() {
        return aniosExperiencia * 45.0;
    }

    @Override
    public String toString() {
        return presentarse() + " | Especialidad: " + especialidad;
    }
}