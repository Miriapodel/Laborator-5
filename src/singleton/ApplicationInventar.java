package singleton;

import java.util.Scanner;

public class ApplicationInventar {

    public static void AfiseazaInventar(Inventar inventar){
        var produse = inventar.getProduse().toArray();

        if(produse.length == 0){
            System.out.println("Momentan nu exista niciun produs in inventar!");
            System.out.println();

            return;
        }

        for (int i = 0; i < produse.length; i++){
            Produs produs = (Produs) produse[i];

            System.out.println(produs);
        }

    }

    public static void AdaugaProdus(Inventar inventar, Scanner scanner){
        String denumire;
        String descriere;
        double pret;

        System.out.println("Denumire: ");
        denumire = scanner.nextLine();

        System.out.println("Descriere: ");
        descriere = scanner.nextLine();

        System.out.println("Pret: ");
        pret = scanner.nextDouble();
        scanner.nextLine();

        Produs produs = new Produs(denumire, descriere, pret);

        inventar.AdaugaProdus(produs);

        System.out.println("Produs adaugat cu succes!");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventar inventar = Inventar.getInstance();

        while (true) {
            System.out.println("1. Vezi produsele din inventar!");
            System.out.println("2. Adauga produse in inventar");
            System.out.println("3. Exit");

            int optiune = scanner.nextInt();
            scanner.nextLine();

            switch (optiune){
                case 1:
                    AfiseazaInventar(inventar);
                    break;

                case 2:
                    AdaugaProdus(inventar, scanner);
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Optiune invalida!");
                    break;
            }
        }
    }

}
