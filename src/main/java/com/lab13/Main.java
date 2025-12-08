package com.lab13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cantidad de Cursos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cursos a registrar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        System.out.println("-------------------------------------");

        // Seleccionar curso OnLine o On Site
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nCurso #" + (i + 1));

            System.out.print("Type (Online / OnSite): ");
            String tipo = sc.nextLine().trim();
            System.out.println();
            System.out.println("1) Ingrese el titulo del curso");
            System.out.print("Titulo: ");
            String j = sc.nextLine();
            System.out.println("-------------------------------------");

            System.out.println("2) Ingresar duración del curso");
            System.out.print("Duración(hs): ");
            int duration = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------------");

            System.out.println("3) Ingresar el nombre del docente");
            System.out.print("Docente: ");
            String professor = sc.nextLine();
            System.out.println("-------------------------------------");

            if (tipo.equalsIgnoreCase("Online")) {
                System.out.println("4) Ingresar plataforma.");
                System.out.print("Platforma: ");
                String platform = sc.nextLine();

            } else {
                System.out.println("4) Ingrese el número deol salón");
                System.out.print("Salón: ");
                String room = sc.nextLine();
                System.out.println("-------------------------------------");

                System.out.println("5) Ingresar el cupo de alumnos");
                System.out.print("Cupo: ");
                int maxQuota = sc.nextInt();
                sc.nextLine();
            }
        }
    }
}
