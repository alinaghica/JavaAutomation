package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = if - then -else; switch-case

    @Test

    public void metodaTest() {
//        medotaVerficareNumar(2);
//        medotaVerficareNumar(7);
//        medotaVerficareNumar(5);

//        metodaNumarParPozitiv(0);
//        metodaNumarParPozitiv(-1);
//        metodaNumarParPozitiv(2);
//        metodaNumarParPozitiv(75);
//        metodaNumarParPozitiv(-26);
        zileSaptamana(3);

    }

    //verificam daca un numar este mai mare decat 5

    public void medotaVerficareNumar(int valoare) {
        if (valoare > 5) {
            System.out.println("numarul " + valoare + " este mai mare decat 5");
        } else if (valoare < 5) {
            System.out.println("numarul " + valoare + " este mai mic decat 5");
        } else {
            System.out.println("numarul " + valoare + " este egal cu 5");
        }
    }

    //verificam daca un numar este par pozitiv sau par negativ

    public void metodaNumarParPozitiv(int num) {
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Numarul " + num + " este par pozitiv");
            } else {
                System.out.println("Numarul " + num + " este impar pozitiv");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("Numarul " + num + " este par negativ");
            } else {
                System.out.println("Numarul " + num + " este impar negativ");
            }

        } else if (num == 0) {
            System.out.println("Numarul " + num + " este 0");
        }

    }

    //exemplu switch case

    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este luni.");
                break;
            case 2:
                System.out.println("Astazi este marti.");
                break;
            case 3:
                System.out.println("Astazi este miercuri.");
                break;
            case 4:
                System.out.println("Astazi este joi.");
                break;
            case 5:
                System.out.println("Astazi este vineri.");
                break;
            case 6:
                System.out.println("Astazi este sambata.");
                break;
            case 7:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Nu mai sunt zile.");
        }
    }

}
