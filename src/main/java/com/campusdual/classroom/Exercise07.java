package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(4);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> listaNum = Arrays.asList(10,9,8,7,6,5,4,3,2,1);

        int pos = listaNum.indexOf(num - 1) ;

        if(pos != -1){
            System.out.println("El elemento "+ num +
                    " se encuentra en la posición: "+ pos);
        }else{
            System.out.println("El elemento "+num+
                    " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }

}
