package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        // Colección heterogénea basada en la superclase raíz
        Persona[] personal = new Persona[4];

        personal[0] = new Empleado("Carlos Gómez", "01234567-8", 800.0);
        personal[1] = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);
        personal[2] = new Docente("Ana Martínez", "03456789-1", "Base de Datos", 6);
        personal[3] = new DocenteInvestigador("Dr. Iván Reyes", "07321456-9", "Ingeniería de Software", 8, 4);

        System.out.println("=== AUDITORÍA DE JERARQUÍAS Y VERIFICACIÓN DE TIPOS ===");

        for (Persona p : personal) {
            System.out.println("\n-------------------------------------------");
            System.out.println("Objeto: " + p.presentarse());
            System.out.println("Beneficio Anual Base/Calculado: $" + p.calcularBeneficioAnual());

            // Verificación con instanceof y aplicación de Downcasting
            if (p instanceof Gerente) {
                Gerente g = (Gerente) p; // Downcasting explícito
                System.out.println("-> Tipo detectado: Gerente");
                System.out.println("-> Tamaño del equipo a cargo: " + g.getTamanoEquipo() + " colaboradores.");
            } else if (p instanceof DocenteInvestigador) {
                DocenteInvestigador di = (DocenteInvestigador) p; // Downcasting explícito
                System.out.println("-> Tipo detectado: Docente Investigador");
                System.out.println("-> Publicaciones realizadas: " + di.getNumeroPublicaciones());
            } else if (p instanceof Empleado) {
                System.out.println("-> Tipo detectado: Empleado operativo general");
            } else if (p instanceof Docente) {
                System.out.println("-> Tipo detectado: Docente de aula general");
            }
        }
    }
}
