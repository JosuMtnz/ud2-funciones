package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int perimetroRectangulo(int base, int altura) {
        int perimetro = (base * altura) / 2;
        return perimetro;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la base del triangulo: ");
        int base = Integer.parseInt(br.readLine());

        System.out.print("Introduce la altura del triangulo: ");
        int altura = Integer.parseInt(br.readLine());

        int resultado = perimetroRectangulo(base, altura);
        System.out.println("El perimetro del triangulo es: " + resultado);

    }
}
