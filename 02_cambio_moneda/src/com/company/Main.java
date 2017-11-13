package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double calcularCambio(double valor, String moneda){

        double resultado = 0;

        switch (moneda) {
            case "USD":
                resultado = valor * 1.16565;
                break;
            case "GBP":
                resultado = valor * 0.889537546;
                break;
            case "CNY":
                resultado = valor * 7.74070803;
                break;
            case "JPY":
                resultado = valor * 132.445177;
                break;
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca una cantidad en euros: ");
        double cantidad = Double.parseDouble(br.readLine());

        String moneda;
        do {
            System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
            moneda = br.readLine().toUpperCase();
        } while (!moneda.equals("USD") && !moneda.equals("GBP") && !moneda.equals("CNY") && !moneda.equals("JPY"));

        double resultado = calcularCambio(cantidad, moneda);
        System.out.format("%.2f€ son %.2f %s",cantidad, resultado, moneda);
    }
}
