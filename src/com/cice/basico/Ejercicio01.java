package com.cice.basico;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main (String[] args ){

        Scanner sc = new Scanner(System.in);
        String fecha;
        int suerte = 0;
        int resultado = 0;

        System.out.println("Introduce tu fecha de nacimiento: ");
        fecha = sc.nextLine();

        String[] datos =  fecha.split("/");

        for ( String dato : datos){
            suerte += Integer.parseInt(dato);


        }

        System.out.println("Suerte: " + suerte);

        String aux = String.valueOf(suerte);

        for (int i = 0; i< aux.length(); i++){
            String ch = String.valueOf(aux.charAt(i));
            resultado += Integer.parseInt(ch);

        }

        System.out.println("Suerte final:" + resultado);


    }
}
