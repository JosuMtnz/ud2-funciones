package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double longitud(double n) {
        return 2 * Math.PI * n ;
    }

    public static double volumen(double n) {
        return 4/3 * Math.PI * Math.pow(n,3);
    }

    public static double area(double n) {
        return Math.PI * Math.pow(n,2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opt;
        double n=0;

        do {
            System.out.print("\n\n=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            opt = br.readLine().charAt(0);

            if (opt == 'a' ||opt == 'b' ||opt == 'c') {
                System.out.print("Escribe el radio: ");
                n = Double.parseDouble(br.readLine());
            }
                switch (opt) {
                    case 'a':
                        System.out.format("El perimetro de %.2f es: %.2f",n, longitud(n));
                        break;
                    case 'b':
                        System.out.format("El área de %.2f es: %.2f",n, area(n));
                        break;
                    case 'c':
                        System.out.format("El volumen de %.2f es: %.2f",n, volumen(n));
                        break;
                    case 'd':
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
            } while (opt != 'd');
        }
    }