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

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public void setProduse(ArrayList<Produs> produse) {
        this.produse = produse;
    }

    public void AdaugaProdus(Produs produs){
        produse.add(produs);
    }
}
