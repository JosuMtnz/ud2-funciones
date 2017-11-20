package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int repetitivo(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    public static int recursivo(int n) {
        if( n == 1){
            return 1;
        } else {
            return recursivo(n-1) * n;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.printf("Factorial repetitivo de %d: %d",numero, repetitivo(numero));
        System.out.printf("\nFactorial recursivo de %d: %d",numero, recursivo(numero));
    }
}
