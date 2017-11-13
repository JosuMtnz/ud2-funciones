package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double temp){
        double r = (temp * 1.8) + 32;
        return r;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce una temperatura en grados centígrados: ");
        double temperatura = Double.parseDouble(br.readLine())*1.00;

        double resultado = convertirTemperatura(temperatura);
        System.out.format("%.1fªC son %.1fªK",temperatura, resultado);
    }
}
