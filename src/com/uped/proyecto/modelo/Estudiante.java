package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carnet;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String dui, String carnet, String carrera, double promedio) {
        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public double calcularBeneficioAnual() {
        return promedio >= 8.5 ? 500.0 : 0.0;
    }

    @Override
    public String toString() {
        return presentarse() + " | Carnet: " + carnet + " | Carrera: " + carrera;
    }
}