package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String morse(String x){
        String r = "";
        switch (x){
            case "ch":
                r = "————";
                break;
            case "a":
                r = "·—";
                break;
            case "b":
                r = "—···";
                break;
            case "c":
                r = "—·—·";
                break;
            case "d":
                r = "—··";
                break;
            case "e":
                r = "·";
                break;
            case "f":
                r = "··—·";
                break;
            case "g":
                r = "——·";
                break;
            case "h":
                r = "····";
                break;
            case "i":
                r = "··";
                break;
            case "j":
                r = "·———";
                break;
            case "k":
                r = "—·—";
                break;
            case "l":
                r = "·—··";
                break;
            case "m":
                r = "——";
                break;
            case "n":
                r = "—·";
                break;
            case "ñ":
                r = "——·——";
                break;
            case "o":
                r = "———";
                break;
            case "p":
                r = "·——·";
                break;
            case "q":
                r = "——·—";
                break;
            case "r":
                r = "·—·";
                break;
            case "s":
                r = "···";
                break;
            case "t":
                r = "—";
                break;
            case "u":
                r = "··—";
                break;
            case "v":
                r = "···—";
                break;
            case "w":
                r = "·——";
                break;
            case "x":
                r = "—··—";
                break;
            case "y":
                r = "—·——";
                break;
            case "z":
                r = "——··";
                break;
            case "0":
                r = "—————";
                break;
            case "1":
                r = "·————";
                break;
            case "2":
                r = "··———";
                break;
            case "3":
                r = "···——";
                break;
            case "4":
                r = "····";
                break;
            case "6":
                r = "—····";
                break;
            case "7":
                r = "——···";
                break;
            case "8":
                r = "———··";
                break;
            case "9":
                r = "————·";
                break;
            case ".":
                r = "·—·—·—";
                break;
            case ",":
                r = "—·—·——";
                break;
            case "?":
                r = "··——··";
                break;
            case "\"":
                r = "·—··—·";
                break;
            case "!":
                r = "——··——";
                break;
        }
        return r;
    }

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = 0;

            System.out.println("Introduce un texto:");
            String texto = br.readLine().toLowerCase();
            n = texto.length();

            for (int i = 0; i < n; i++) {

                if (String.valueOf(texto.charAt(i)).equals("c") && texto.length() >= i+1){
                    if (i+1 < texto.length() && String.valueOf(texto.charAt(i+1)).equals("h")){
                        System.out.format("%s ",morse("ch"));
                        i++;
                    } else {
                        System.out.format("%s ",morse(String.valueOf(texto.charAt(i))));
                    }
                } else {
                    System.out.format("%s ",morse(String.valueOf(texto.charAt(i))));
                }
            }
        }
}
