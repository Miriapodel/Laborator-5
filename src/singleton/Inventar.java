package singleton;

import java.util.ArrayList;

public class Inventar {

    private static Inventar inventar;

    private ArrayList<Produs> produse = new ArrayList<>();

    private Inventar(){}

    public static Inventar getInstance(){
        if (inventar == null){
            inventar = new Inventar();
        }

        return inventar;
    }

}
