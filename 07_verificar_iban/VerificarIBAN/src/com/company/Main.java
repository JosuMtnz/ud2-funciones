package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean verificarIban(String iban){

        // Eliminar los espacios en blanco
        iban=iban.replaceAll("\\s","");

        // Extraer los 4 primeros caracteres
        String cuatroprimeros=iban.substring(0,4);
        String restocadena=iban.substring(4);

        // Convertir cualquier letra en número de acuerdo con la tabla estándar
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroprimeros.charAt(0)) + 10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroprimeros.charAt(1)) + 10;

        // Concatenar variables
        String nuevoIBAN = restocadena + numero1 + numero2 + cuatroprimeros.substring(2);

        // Convertir en LONG y comprobar checksum.
        long numero = Long.parseLong(nuevoIBAN);
        return numero % 97 == 1;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String iban = "BE88 3200 3471 3431";

        if (verificarIban(iban)) {
            System.out.format("El IBAN: \"%s\" es correcto.\n",iban);
        } else {
            System.out.format("El IBAN: \"%s\" es correcto.\n",iban);
        }

    }
}
