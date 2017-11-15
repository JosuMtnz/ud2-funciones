package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(int escala, double tmp){
        double r = 0;
        if (escala == 1) {
            r = (tmp * 1.8) + 32;
        } else if (escala == 2) {
            r = tmp + 273.15;
        }
        return r;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opt;
        do {
            System.out.print("\n=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción: ");
            opt = Integer.parseInt(br.readLine());

            double temperatura = 0;
            if (opt == 1 || opt == 2) {
                System.out.print("Introduce la temperatura en ªC: ");
                temperatura = Double.parseDouble(br.readLine()) * 1.00;
            }

                switch (opt){
                    case 1:
                        System.out.println(temperatura+"ªC son "+convertirTemperatura(opt,temperatura)+"ªF");;
                        break;
                    case 2:
                        System.out.println(temperatura+"ªC son "+convertirTemperatura(opt,temperatura)+"ªK");;
                        break;
                    case 3:
                        System.out.println("Salir.");
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                        break;
                }
        } while (opt !=3);
    }
}
