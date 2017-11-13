package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int numero){
        boolean check;
        if (numero % 2 == 0){
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static boolean esImpar(int numero){
        boolean check;
        if (numero % 2 != 0){
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un numero para comprobar si es par o impar: ");
        int n = Integer.parseInt(br.readLine());

        if (esImpar(n)){
            System.out.format("El número %d es impar.", n);
        }

        if (esPar(n)){
            System.out.format("El número %d es par.", n);
        }

    }
}
