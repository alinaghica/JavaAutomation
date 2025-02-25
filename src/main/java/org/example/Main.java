package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Calculate the Perimeter of a Rectangle:
        int length = 10;
        int width = 8;
        System.out.println("Perimetrul unui drepturighi cu lungimea " + length + " si latimea " + width + " este: " + getPerimeter(length, width));

        //2.Convert Minutes into Seconds:

        int minutes = 15;
        System.out.println(minutes + " minute sunt " + getSeconds(minutes) + " secunde");

        //citireNote();
        //printareValoriWhile();
        printareValoareDoWhile();
        printareValoriFor();
    }


    //1. Calculate the Perimeter of a Rectangle:
    public static Integer getPerimeter(int length, int width) {

        int perimeter = 2 * length + 2 * width;
        return perimeter;

    }

    //2.Convert Minutes into Seconds:
    //Initialize an integer minutes with any value. Convert this into seconds and print the result.

    public static Integer getSeconds(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }

    public static void citireNote() {

        System.out.println("Introduceti nota");
        Scanner scanner = new Scanner((System.in));

        int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog sa introduci o valoare valida.");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este intre 1 si 10");
    }

    public static void printareValoriWhile() {
        int valoare = 1;
        while (valoare <= 5) {
            System.out.println("Valoarea este " + valoare);
            valoare++;
        }
        System.out.println("Valoarea dupa parcurgerea while este: "+ valoare);
    }

    public static void printareValoareDoWhile() {
        int valoare = 6;
        do {
            System.out.println("Valoarea este " + valoare);
            valoare++;
        } while (valoare <= 5);
        System.out.println("Valorea dupa parcurgerea do while este: "+ valoare);
    }




    public static void printareValoriFor(){

        for(int valoare=1;valoare<=5;){
            System.out.println("Valoarea este " + valoare);
            valoare ++;
        }
    }





}




