package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int fibRecursivo(int n){
        if (n < 2){
            return n;
        } else {
            return fibRecursivo(n-1) + fibRecursivo(n-2);
        }
    }

    public static int fibRepetitivo(int n){
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = b + a;
            a = b;
            b = c;
        }
        return a;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce el n-ésimo elemento de Fibonacci a calcular: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.printf("Recursivo; El %d elemento de la serie de Fibonacci es: %d\n",numero, fibRecursivo(numero));
        System.out.printf("Repetitivo; El %d elemento de la serie de Fibonacci es: %d",numero, fibRepetitivo(numero));
    }
}
