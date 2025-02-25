package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //multimi: array, list, map

    @Test
    public void metodaTest(){
        //colegiCurs();
        //colegiCursLista();
        //categoriiObiecte();
        tariOrase();

    }

    //exeplu array

    public void colegiCurs(){
        String[] colegi = new String[6];
        colegi[0] = "Ana-Maria";
        colegi[1] = "Cristina Popescu";
        colegi[2] = "Mihai Constantin";
        colegi[3] = "Vlad Mihoc";
        colegi[4] = "Alina Ghica";
        colegi[5] = "Alex Barbu";

        for (int i=0; i<colegi.length; i++){
            System.out.println("Numele colegului este: " + colegi[i]);
        }
    }
//exemplu lista

    public void colegiCursLista(){
        List<String> colegi =  new ArrayList<>();
        colegi.add("Ana-Maria");
        colegi.add("Cristina Popescu");
        colegi.add("Mihai Constantin");
        colegi.add("Vlad Mihoc");
        colegi.add("Alina Ghica");
        colegi.add("Alex Barbu");

        int i = 0;
        while (i<colegi.size()){
            System.out.println(colegi.get(i));
            i++;
        }
    }

    //exemplu map
    //map -> cheie = valoare

    public void categoriiObiecte(){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");


        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoare este: " + obiecte.get(key));

        }

    }


    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Iasi");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Suceava");
        oraseRomania.add("Cluj-Napoca");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Taormina");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevilia");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);


        for (String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));

        }
    }
}
