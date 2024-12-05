package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;

    public String model;

    public Integer anFabricatie;

    @Test

    public void metodaTest(){
        dateMasina("Dacia", "1310", 1984);
        dateMasina("Audi", "A4", 2022);


        calculMedie(8.00, 8.50);
    }

    public void dateMasina(String param1, String param2, Integer param3){

        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masnii este: " + model);
        System.out.println("Anul de fabricatie este: " + anFabricatie);
    }
 // calculam media a 2 numere

    public void calculMedie (Double numar1, Double numar2){
        Double rezultat = (numar1 + numar2)/2;
        System.out.println("Media celor doua numere este: " + rezultat);
    }

}


