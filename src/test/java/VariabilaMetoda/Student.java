package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //class = sablon care defineste proprietatile si comportamentul unei entitati specifice
    //intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa avem mai multe clase cu acelasi nume)
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila = proprietatea unei clase
    //variabilele pot fi de 2 tipuri: globale si locale
    //variabilele globale = sunt vizibile peste tot in proiect
    //variabilele locale = sunt vizibile doar in locul unde le-ai declarat
    // ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila
    //metoda = actiunea unei clase
    //exista 2 tipuri de metode: void si return


    public String nume ;

    // in momentul cand definim o variabila, nu este obligatoriu sa-i dam o valoare

    public String prenume;

    public Integer varsta;

    public String adresa;

    public Double inaltime;

    public Float greutate;

    public Character sex;

    public Boolean areDiploma;

    @Test

    public void prezentareStudent (){

        nume="Ghica";
        prenume="Alina";
        varsta=40;
        adresa="Strada Stejarului nr. 24, Iasi";
        inaltime=1.67;
        greutate=60.00f;
        sex='F';
        areDiploma=true;

        System.out.println("Numele studentului este: " + nume);
        System.out.printf("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Inaltimea studentului este: " + inaltime);
        System.out.println("Greutatea studentului este: " + greutate);
        System.out.println("Sexul studentului este: " + sex);
        System.out.println("Are studentul diploma? " + areDiploma);

        calculMedie();


    }

    public void calculMedie(){

        Integer nota1=8;
        Integer nota2=5;
        Integer nota3=7;
        Integer media=(nota1 + nota2 + nota3)/3;

        System.out.println("Media studentului este: " + media);
    }
}
